package EjRep;


class Main{
    public static void main(String[]args){
        ManagerProduct manager= new ManagerProduct();
        System.out.println("Add product");
        try{
            manager.addProduct(1,"Patatas",9.99);
            System.out.println("Hacemos print de todo:");
        } catch(ProductAlreadyExistsException e) {
            System.out.println(e);
            }
        
        manager.seeProduct();
        System.out.println("Borramos un producto");
        manager.deleteProduct(1);
        System.out.println("Hacemos print de todo:");
        manager.seeProduct();

    }
}