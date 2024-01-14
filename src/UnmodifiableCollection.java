import java.util.*;
public class UnmodifiableCollection {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
                System.out.println("Input size: ");
                n = sc.nextInt();
                String ele;
                List<String> li = new ArrayList<>();
                System.out.println("Input elements: ");
                for(int i=0;i<n;i++){
                    ele=sc.next();
                    li.add(ele);
                }
               li.add("Extra");
//               li.stream().forEach(System.out::print);
               for(String i:li){
                   System.out.print(i+" ");
               }
               li.remove("Extra");
               System.out.println();
              for(String i:li){
                  System.out.print(i+" ");
              }
              System.out.println();

               //Make list unmodifiable
        try {
            li = Collections.unmodifiableList(li);

            // This line will generate an Exception
            li.remove(1);
        }
        catch (UnsupportedOperationException
                unsupportedOperationException) {
            System.out.println(
                    "Exceptions is "
                            + unsupportedOperationException);
        }
        finally {
            System.out.println(li.get(2));
            System.out.println(
                    "Now list is only Read-Only");
        }

        }


    }

