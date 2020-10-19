class Prueba {
    
    
    
    public static void main(String[] args) {
        String a = "Hola mundo hi";
        String[] b = a.split(" ", 4);
        //System.out.println(b.toString());
        for(int i=0; i<b.length; i++){
            String c = b[i];
            System.out.println(b[i]);
        }
    }
}