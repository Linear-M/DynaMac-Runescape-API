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
import com.Marneus.Enviroment.Hook.ClassHook.FieldHook;

public class TileData {
	public Object currentObject;
	public ClassHook currentHook;
	public TileData(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("TileData");
	}
	public int[][] getHeights(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getHeights")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (int[][])data;
			}
		}		
		return new int[][]{{}};		
	}
}
