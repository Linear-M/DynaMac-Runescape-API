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

import java.util.ArrayList;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class Interface {
	public int index;
	public Object currentObject;
	public ClassHook currentHook;
	public Interface(int i, Object o){
		index=i;
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Interface");
	}
	public InterfaceChild[] getChildren(){
		Object data = currentHook.getData("getChildren", currentObject);
		if(data!=null){
			ArrayList<InterfaceChild> array = new ArrayList<InterfaceChild>();
			int i=0;
			for(Object o : (Object[])data){
				array.add(new InterfaceChild(o, this, i));
				i++;
			}
			return array.toArray(new InterfaceChild[]{});
		}
		return new InterfaceChild[]{};
	}	
}
