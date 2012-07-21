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

public class Ground {
	public Object currentObject;
	public ClassHook currentHook;
	public Ground(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Ground");
	}
	public FloorDecoration getFloorDecoration(){
		Object data = currentHook.getData("getFloorDecoration", currentObject);
		if(data!=null)
			return new FloorDecoration(data);
		return null;		
	}
	public Boundary getBoundary1(){
		Object data = currentHook.getData("getBoundary1", currentObject);
		if(data!=null)
			return new Boundary(data);
		return null;		
	}
	public Boundary getBoundary2(){
		Object data = currentHook.getData("getBoundary2", currentObject);
		if(data!=null)
			return new Boundary(data);
		return null;		
	}
	public WallDecoration getWallDecoration1(){
		Object data = currentHook.getData("getWallDecoration1", currentObject);
		if(data!=null)
			return new WallDecoration(data);
		return null;		
	}
	public WallDecoration getWallDecoration2(){
		Object data = currentHook.getData("getWallDecoration2", currentObject);
		if(data!=null)
			return new WallDecoration(data);
		return null;		
	}
	public AnimableNode getAnimableList(){
		Object data = currentHook.getData("getAnimableList", currentObject);
		if(data!=null)
			return new AnimableNode(data);
		return null;		
	}
}
