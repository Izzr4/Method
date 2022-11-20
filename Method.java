import java.util.Scanner;

public class Method
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        s.nextLine();
        String [] arr = new String[size];
        for (int i = 0;i<size;i++){
            arr[i] = s.nextLine();
        }
        String[] Penembak = new String[5];
        String[] mekanikal = new String[2];
        String[] ahliBom = new String[10];
        String[] navigation = new String[2];
        pemisahan(arr,Penembak,mekanikal,ahliBom,navigation);
        tampilkan(Penembak,mekanikal,ahliBom,navigation);
    }
    public static void pemisahan(String[]arr,String[]Penembak,String[] ahliMesin,String[] ahliMeriam, String[] navigator)
    {
        for(int i = 0;i < arr.length;i++)
        {
            String[] split = arr[i].split(" ");
            if(arr[i].contains("Penembak"))
            {
                penembak(split[1],i,Penembak);
            }
            else if(arr[i].contains("Mesin"))
            {
                ahliMesin(split[2],i,ahliMesin);
            }
            else if(arr[i].contains("Meriam"))
            {
                ahliMeriam(split[2],i,ahliMeriam);
            }
            else if(arr[i].contains("Navigator"))
            {
                navigator(split[1],i,navigator);
            }
        }
    }
    public static void penembak(String nama, int index,String[]penembak)
    {
        for(index = 0;index < 5;index++)
        {
            if(penembak[index] == null)
            {
                penembak[index] = nama;
                break;
            }
        }
    }
    public static void ahliMesin(String nama, int index, String[] ahliMesin)
    {
        for(index = 0;index < 2;index++)
        {
            if(ahliMesin[index] == null)
            {
                ahliMesin[index] = nama;
                break;
            }
        }
    }
    public static void ahliMeriam(String nama, int index, String[] ahliMeriam){
        for(index = 0;index < 10;index++)
        {
            if(ahliMeriam[index] == null)
            {
                ahliMeriam[index] = nama;
                break;
            }
        }
    }
    public static void navigator(String nama, int index, String[] navigator)
    {
        for(index = 0;index < 2;index++)
        {
            if(navigator[index] == null)
            {
                navigator[index] = nama;
                break;
            }
        }
    }
    public static void tampilkan(String[] penembak, String[] ahliMesin, String[]ahliMeriam,String[]navigation)
    {
        System.out.println("Penembak yang diterima pak Dengklek adalah :");
        for(String s: penembak)
        {
            if(s == null)
            {
                break;
            }
            else
            {
                System.out.println(s);
            }
        }
        System.out.println("\nAhli Mesin yang diterima pak Dengklek adalah :");
        for(String s: ahliMesin)
        {
            if(s == null)
            {
                break;
            }
            else
            {
                System.out.println(s);
            }
        }
        System.out.println("\nAhli Meriam yang diterima pak Dengklek adalah :");
        for(String s: ahliMeriam)
        {
            if(s == null)
            {
                break;
            }
            else
            {
                System.out.println(s);
            }
        }
        System.out.println("\nNavigator yang diterima pak Dengklek adalah :");
        for(String s: navigation)
        {
            if(s == null)
            {
                break;
            }
            else
            {
                System.out.println(s);
            }
        }
    }

}
