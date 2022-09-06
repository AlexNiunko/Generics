public class Gen2 {

        public <T,V> Gen2(T o,V b){
        if (o.getClass().equals(b.getClass())){
            System.out.println("Одинаковые классы");
        }
        else
            System.out.println("Не одинаковые");
    }

}
