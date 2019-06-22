package com.covalanse.java.assignment.two;
import lombok.extern.java.Log;
@Log
public class Baby {
     void receive(IceCream o) {
    	 log.info("Take Ice Cream");
    	 o.open();
     }
}
