/******************************************************
* Created by Marneus901                                *
* © 2012 MarneusScripts.com                            *
* **************************************************** *
* Access to this source is unauthorized without prior  *
* authorization from its appropriate author(s).        *
* You are not permitted to release, nor distribute this* 
* work without appropriate author(s) authorization.    *
********************************************************/
package com.Marneus.Bot.API.Wrappers;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class PlayerDef {
	public Object currentObject;
	public ClassHook currentHook;
	public PlayerDef(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("PlayerDef");
	}
	public int[] getEquipment(){
		Object data = currentHook.getData("getEquipment", currentObject);
		if(data!=null)
			return (int[])data;
		return new int[]{};
	}
	public int getID(){
		Object data = currentHook.getData("getID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
}
