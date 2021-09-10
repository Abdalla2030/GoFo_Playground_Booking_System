import java.util.ArrayList;

/**
 * /**
 * 
 * @author Abdalla Fadl 
 * @author Mostafa Nasser Mohamed Ali
 *
 */
 
public class Playground {

    private String owner;
    private String playgroundName;
    private Adress address;
    private String type;
    private boolean Status;
    private int capacity;
    private int id;
    private ArrayList<Slot> availableSlots ;
    /**
     * Default  constructor
     */
    
    public Playground(){
    	owner = "";
    	playgroundName="";
        address = new Adress();
        type="";
        Status=false;
        capacity=0;
        id = 0;
        availableSlots = new ArrayList<Slot>();
      
    }
    /**
     * @param ad is the address of playground
     * @param Owner playground owner name
     * @param p_name palyground name
     * @param type type of the ground of playground
     * @param size capacity of playground
     * @param id id for the playground
     */
    public Playground(String Owner, String p_name,  int id,  Adress ad, String type, int size) {
    		owner = Owner;
    		playgroundName = p_name;
    		this.type = type;
    		capacity = size;
    		this.id = id;
    		 address = ad;
    		 availableSlots = new ArrayList<Slot>();
    }

    /**
     *
     * @param owner name of playground owner
     */
    public void setOwner(String name ) {
        this.owner=name;
       
    }

    /**
     *
     * @param name name of the ground
     */
    public void setName(String name) {
    	playgroundName = name;
    }
    
    /**
     * 
     * @param loction
     * @param city
     * @param neighbourhood
     */
    
    public void setAdrees(String loction, String city, String neighbourhood){
    	address = new Adress(loction,city,neighbourhood);
    	
    }
   
    /**
     *
     * @param type natural herb or Industrial herb
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @param capacity maximum number of palyer that can fit with playground size 
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return playground owner name
     */
    public String getOwner() {
        return owner;
    }
    /**
     *
     * @return playground name
     */
    public String getName() {
        return playgroundName;
    }

   /**
    * 
    * @return type of ground
    */
    public String getType() {
        return type;
    }

    /**
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }
    
    /**
     * 
     * @param s set Status for playground  true for activated and false for suspended
     */
    
    public void setStatus(boolean s) {
    	Status = s;
    }

    /**
     *
     * @return  Status of playground
     */
    public boolean getStatus(){
        return Status;
    }

    /**
     * 
     * @param num set id for playground
     */
    public void setID(int num) {
    	id = num;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @return return address of palyground
     */
    public Adress getAdress() {
    	return address;
    }
    /**
     * 
     * @param s add slot to a playground
     */
    public void addSlot(Slot s) {
    	availableSlots.add(s);
    }
    /**
     * 
     * @param s delete slot from playground
     */
    public void  deleteSlot(Slot s) {
    	availableSlots.remove(s);
    }
  

    /**
     *
     * @return available slots in aplayground
     */
    public ArrayList<Slot> getAvailableSlots() {
        return availableSlots;
    }
    
}
