
package com.mycompany.q;


public class Item {
    private int location;
    private String description;
    
    public Item(int l,String d)
    {
        location=l;
        description=d;
    }
    
    public void setlocation(int location)
    {
        this.location=location;
    }
    public void setdescrption(String description)
    {
        this.description=description;
    }
    public int getlocation()
    {
        return location;
    }
    public String getdescription()
    {
        return description;
    }
            
    
}
