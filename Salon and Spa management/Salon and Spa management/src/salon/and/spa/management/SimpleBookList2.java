
package salon.and.spa.management;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.util.ArrayList;
import java.io.*; //File,FileReader,FileNotFoundException,BufferedReader,IOException
public class SimpleBookList2 {
   private ArrayList<SimpleBook> bookList;
   public SimpleBookList2() {
      bookList = new ArrayList<SimpleBook>();
   }
   public void add(SimpleBook sb) {
      bookList.add(sb);
   }
   public void readFromCSV(String filename) {
      File file = new File(filename);
      FileReader reader = null;
      try {
         reader = new FileReader(file);
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
         System.exit(1);
      }
      BufferedReader infile = new BufferedReader(reader);
      String line = "";
      try {
         boolean done = false;
         while (!done) {
            line = infile.readLine();
            if (line == null) {
               done = true;
            }
            else {
               String[] tokens = line.trim().split(",");
               String name = tokens[0].trim();
               String date = tokens[1].trim();
               String month = tokens[2].trim();
              
               String time = tokens[3].trim();
               //int phone = (int) Double.parseDouble(tokens[4].trim());
               String phone=tokens[4].trim();
               String email = tokens[5].trim();
                String ID=tokens[6].trim();
// String ID = (int) Double.parseDouble(tokens[6].trim());// String pay = tokens[8].trim();
               SimpleBook sb = new SimpleBook(name,date,month,time,phone,email,ID);
               bookList.add(sb);
            }
         }
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
   public Object[][] convert2Data() {
       Object[][] data = new Object[bookList.size()][7];
       for (int i = 0; i < bookList.size(); i++) {
          data[i][0] = bookList.get(i).getName();
          data[i][1] = bookList.get(i).getDate();
          data[i][2] = bookList.get(i).getMonth();
          
          data[i][3] = bookList.get(i).getTime();
          data[i][4] = bookList.get(i).getPhone();
          data[i][5] = bookList.get(i).getEmail();
          data[i][6] = bookList.get(i).getID();
         
       }
       return data;
   }
}