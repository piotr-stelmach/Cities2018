
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cities {
   private Map<String,List<String>> provinces =new HashMap(); 

    public Cities() {
       List<String> list1=new ArrayList<>();
       list1.add("Elblag");
       list1.add("Olsztyn");
       list1.add("Ostroda");
       list1.add("Elk");
       List<String> list2=new ArrayList<>();
       list1.add("Gdansk");
       list1.add("Sopot");
       list1.add("Gdynia");
       list1.add("Kartuzy");
        List<String> list3=new ArrayList<>();
       list1.add("Torun");
       list1.add("Bydgoszcz");
       provinces.put("Warminsko-Mazurskie", list1);
       provinces.put("Pomorskie", list2);
       provinces.put("Kujawsko=pomorskie", list3);
    }
    
    public Collection<String> provinces(){
        return provinces.keySet();
    }
    public List<String> cities(String province){
        return provinces.get(province);
    }
    public Map<String,String> provinceWithOneCity(){
        
    }
    
    public Collection<String> cities(){
        
    }
            
    public static void main(String[] args){
        Cities c=new Cities();
        
    }
   
   
}
