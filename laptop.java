import java.util.ArrayList;


public class laptop {
    
    private String Name;

    private String Cpu;

    private String Color;

    private int Ram;

    public laptop(String Name, String Cpu, String Color, int Ram){
        this.Name = Name;
        this.Cpu = Cpu;
        this.Color = Color;
        this.Ram = Ram;
    }

    //
    public String GetName(){
        return Name;
    }

    public void SetName(String Name){
        this.Name = Name;
    }
    //
    public String GetCpu(){
        return Cpu;
    }

    public void SetCpu(String Cpu){
        this.Cpu = Cpu;
    }

    //
    public String GetColor(){
        return Color;
    }

    public void SetColor(String Color){
        this.Color = Color;
    }

    public int GetRam(){
        return Ram;
    }

    public void SetRam(int Ram){
        this.Ram = Ram;
    }

    public static void Sysout(laptop laptop){
        System.out.println("Name: "+laptop.GetName()+", Cpu: "+laptop.GetCpu()+", Color: "+laptop.GetColor()+", Ram: "+ laptop.GetRam());
    }


    
    public static void FilterByName(ArrayList<laptop> list, String name){
        /*System.out.println("Input the name of laptop");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();*/
        //По идее надо убрать из 61 строки String Name и он должен так работать, а дальше пустить в ход схему с уже созданной мапой с критериями, но почему-то он не работает
        //В итоге только так
        for (laptop laptop : list){
            if (laptop.GetName() == name) {
                Sysout(laptop);
            }
        }
    }

    public static void FilterByCpu(ArrayList<laptop> list, String Cpu){
        for (laptop laptop : list){
            if (laptop.GetCpu() == Cpu) {
                Sysout(laptop);
            }
        }
    }

    public static void FilterByColor(ArrayList<laptop> list, String Color){
        for (laptop laptop : list){
            if (laptop.GetColor() == Color) {
                Sysout(laptop);
            }
        }
    }

    public static void FilterByRam(ArrayList<laptop> list, int Ram){
        for (laptop laptop : list){
            if (laptop.GetRam() == Ram) {
                Sysout(laptop);
            }
        }
    }

}
