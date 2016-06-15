/*
 * Copyright (c) 2016 Juniper Networks, Inc. All rights reserved.
 */
package ordt.extract;

/** class of addressable model component instance (addrmap, regset, reg) */
public class ModAddressableInstance extends ModInstance {
	// address elements
    private RegNumber address;
    private RegNumber addressIncrement;
    private RegNumber addressModulus;  
    private RegNumber addressShift;  
    
	public ModAddressableInstance() {
		isAddressable = true;
	}
	/** write info to stdout */
	@Override
	public void display (boolean showInstanceComponent) {
			String compID = "";
			if (regComp != null) {
				compID = regComp.getId();
				if ((compID == null) || compID.isEmpty()) compID = "<anonymous>";
			}
			System.out.println("\n--------- Addressable Instance of " + compID + "   id=" + getFullId() ); 
			//System.out.println("         full id=" + getFullId()); 
			System.out.println("    replication count=" + getRepCount());   
			System.out.println("    root instance=" + isRootInstance());   
			System.out.println("    address=" + getAddress() + ",  addressInc=" + getAddressIncrement() + ",  addressMod=" + getAddressModulus());
			// display parms
			System.out.println("    properties:");
			System.out.println("        " + properties);

	        // optionally display component
			if ((regComp != null) && showInstanceComponent) regComp.display();
	}

	// -------------- address methods
	
	/** get Address
	 *  @return the Address
	 */
	public RegNumber getAddress() {
		return address;
	}

	/** set Address
	 *  @param  the address to set
	 */
	public void setAddress(RegNumber address) {
		this.address = address;
	}

	public void setAddress(String numStr) {
		if (numStr != null) setAddress(new RegNumber(numStr));			
	}

	/** get addressIncrement
	 *  @return the addressIncrement
	 */
	public RegNumber getAddressIncrement() {
		return addressIncrement;
	}

	/** set addressIncrement
	 *  @param addressIncrement the addressIncrement to set
	 */
	public void setAddressIncrement(RegNumber addressIncrement) {
		this.addressIncrement = addressIncrement;
	}

	public void setAddressIncrement(String numStr) {
		if (numStr != null) setAddressIncrement(new RegNumber(numStr));					
	}

	/** get addressModulus
	 *  @return the addressModulus
	 */
	public RegNumber getAddressModulus() {
		return addressModulus;
	}

	/** set addressModulus
	 *  @param addressModulus the addressModulus to set
	 */
	public void setAddressModulus(RegNumber addressModulus) {
		this.addressModulus = addressModulus;
	}

	public void setAddressModulus(String numStr) {
		if (numStr != null) setAddressModulus(new RegNumber(numStr));					
	}

	/** get addressShift
	 *  @return the addressShift
	 */
	public RegNumber getAddressShift() {
		return addressShift;
	}

	/** set addressShift
	 *  @param addressShift the addressShift to set
	 */
	public void setAddressShift(RegNumber addressShift) {
		this.addressShift = addressShift;
	}

	public void setAddressShift(String numStr) {
		if (numStr != null) setAddressShift(new RegNumber(numStr));					
	}
	
	/** set a numeric instance variable - overridden in ModInstance child classes
	 * 
	 * @param key - if this key is found, instance value will be updated to val
	 * @param val - value to be used
	 */
	@Override
	protected void updateInstanceVar(String key, String val) {
		if ("address".equals(key)) {  // can be passed from comp in jspec
			setAddress(val);
			//System.err.println("ModInstance " + this.getFullId() + ": updating key=" + key + " with value=" + val);
		}
		else if ("addrinc".equals(key)) setAddressIncrement(val);   // can be passed from comp in jspec
		else if ("addrmod".equals(key)) setAddressModulus(val); // TODO - ever happen??
		else if ("addrshift".equals(key)) setAddressShift(val);
	}

}
