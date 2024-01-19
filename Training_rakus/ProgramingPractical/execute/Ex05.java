public class Ex05 {
    public static void main(String[] args) {
        String bigNumber = "阿僧祇：那由他：不可思議：無量大数";
        
        for(String s:bigNumber.split("：")){
            System.out.println(s);
        }
    }
}
