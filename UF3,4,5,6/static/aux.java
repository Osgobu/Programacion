 class aux{
    public static int num_instancies=0;
    public aux{
        num_instancies++;
    }
 }

 class main{
    public static void main(String[]args){
        System.out.println("Numero de instancias inicial: " +aux.num_instancies);
        aux x = new aux();
        System.out.println    }
 }