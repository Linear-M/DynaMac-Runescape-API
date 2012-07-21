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

public class GroundData {
	public Object currentObject;
	public ClassHook currentHook;
	public GroundData(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("GroundData");
	}
	public int[][] getBlocks(){
		Object data = currentHook.getData("getBlocks", currentObject);
		if(data!=null)
			return (int[][])data;
		return new int[][]{};
	}
	public int getX(){
		Object data = currentHook.getData("getX", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
	public int getY(){
		Object data = currentHook.getData("getY", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
}
