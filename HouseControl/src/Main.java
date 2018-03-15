public class Main {
    
    public static void main(String[] ar){
         
        Room room1, room2, room3, room4, room5, room6, room7;
	room1 = new Room("Living");
        room2= new Room("Kitchen");
	room3= new Room("Garage");
	room4= new Room("Bathroom");

	room5= new Room("Bedroom 1");
	room6 = new Room("Bedroom 2");
	room7= new Room("Bathroom");

	Level level1, level2;
	level1= new Level("Ground");
	level2= new Level("1st Floor");
        
       //GROUND
	room1.addDevice(new Device("Reynaldo", "LG", "123456", true));
        room2.addDevice(new Device("Andrea", "Nokia", "Lumia-520", true));
        room3.addDevice(new Device("Karina","Panasonic","465464", true));
        room4.addDevice(new Device("Martin", "ZTE", "V7",true));
       
	room1.addDevice(new Device ("Limberth","LG", "lg-206",true));
        room2.addDevice(new Device("jesus", "hp","2997", true));
        room3.addDevice(new Device("Rich", "Asus","Zenfone_4_Max",true));
        room4.addDevice(new Device("Adrian","Apple","SE",true));
       
       
	level1.addRoom(room1);
	level1.addRoom(room2);
	level1.addRoom(room3);
	level1.addRoom(room4);

	System.out.println(level1);

	level1.RemoveRoom(room2);
	
	System.out.println(level1);

	System.out.println("--------------------------------------------");
	//FIRST
	room5.addDevice(new Device("Antonio","Samsung","J5",true));
        room6.addDevice(new Device("Roberto","HP","SpectreX360",true));
        room7.addDevice(new Device("Gabriel","Linu","Ilium_S106",true));

	room5.addDevice(new Device ("Jonatan","samsung","J5",true));
        room7.addDevice(new Device("Jessica", "Huaweii", "P9LITE", true));
        room6.addDevice(new Device("Aire acondicionado", "Mabe" , "Mmt12cdbs3", true));



	level2.addRoom(room5);
	level2.addRoom(room6);
	level2.addRoom(room7);


	System.out.println(level2);
 	
	room7.removeDevice(new Device("Jessica", "Huaweii", "P9LITE", true));
        
        System.out.println(room7);

	System.out.println(level2);


    }
    
}