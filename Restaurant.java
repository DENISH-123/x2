class Restaurant{
    int restaurant_id = 10;
    String name="Denish";
    void display_detail(){
        System.out.println("Restaurant Id is" + restaurant_id);
        System.out.println("Name is " + name);
    }
    void menu_items(){
        System.out.println("Bajiya");
        System.out.println("Pakoda");
        System.out.println("Samosa");
        System.out.println("Bataka Bhugla");
    }
    public static void main(String[] args){
        Restaurant x = new Restaurant();
        x.display_detail();
        x.menu_items();
    }
}