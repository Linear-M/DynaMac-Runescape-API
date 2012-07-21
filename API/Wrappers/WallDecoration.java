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

public class WallDecoration {
	public Object currentObject;
	public ClassHook currentHook;
	public WallDecoration(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("WallDecoration");
	}
	public Interactable getInteractable(){
		return new Interactable(currentObject);
	}
	public FloorDecoration getFloorDecoration(){
		return new FloorDecoration(currentObject);
	}
	public WallObject getWallObject(){
		try{
			return new WallObject(currentObject);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
