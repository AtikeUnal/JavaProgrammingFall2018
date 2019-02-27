package Assignments;
import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
    	this.regularItems=new ArrayList();
    	this.onSaleItems=new ArrayList();
        
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
       this.regularItems.add(item);
       
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        this.onSaleItems.add(item);
        
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null 
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
         //TODO change from null 
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
         //TODO change from -1 
    	int regularItemsCount=regularItems.size();
        return regularItemsCount;
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1 
    	int onSaleItemsCount=onSaleItems.size();
        return onSaleItemsCount;
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     * ===========================================================
     */
    public List<String> getAllItemNames() {
       
       List<String> allNames=new ArrayList();
       for(Item eachItem:regularItems) {
    	   allNames.add(eachItem.getName());
       }
       for(OnSaleItem each:onSaleItems) {
    	   allNames.add(each.getName());
       }
       return allNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
    	
    	for(Item regular:regularItems) {
    		if(regular.getCatalogNumber()==catalogNumber) {
    			return regular.getPrice();
    		}
    		
    	}
    	for(OnSaleItem saleItem:onSaleItems) {
    		if(saleItem.getCatalogNumber()==catalogNumber) {
    			return saleItem.getPrice();
    		}
    		
    	}
    
       
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    { 
    	OnSaleItem returnItem=null;
        for(OnSaleItem each:onSaleItems) {
        	if(each.getName().equals(name)) {
        		returnItem=each;
        	}
        }
        
        return returnItem;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for(int i=0; i<regularItems.size(); i++) {
        	if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
        		regularItems.remove(regularItems.get(i));
        	}
        }
        for(int i=0; i<onSaleItems.size(); i++) {
        	if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
        		onSaleItems.remove(onSaleItems.get(i));
        	}
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
       
       
       
       
    }


}
