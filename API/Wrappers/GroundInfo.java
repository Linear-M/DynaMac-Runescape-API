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

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class GroundInfo {
	public Object currentObject;
	public ClassHook currentHook;
	public GroundInfo(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("GroundInfo");
	}
	public TileData[] getTileData(){
		Object data = currentHook.getData("getTileData", currentObject);
		if(data!=null){
			ArrayList<TileData> array = new ArrayList<TileData>();
			for(Object o : (Object[])data){
				array.add(new TileData(o));
			}
			return array.toArray(new TileData[]{});
		}
		return new TileData[]{};
	}
	public Ground[][][] getGroundArray(){
		Object data = currentHook.getData("getGroundArray", currentObject);
		if(data!=null){
			Ground[][][] tempArray = new Ground[][][]{};
			int x = Array.getLength(data);
			tempArray = new Ground[x][][];
			for(int x2=0;x2<x;++x2){
				Object curr = Array.get(data, x2);
				if(curr==null)
					continue;
				int y = Array.getLength(curr);
				tempArray[x2] = new Ground[y][];
				for(int y2=0;y2<y;++y2){
					Object curr2 = Array.get(curr, y2);
					if(curr2==null)
						continue;
					int z = Array.getLength(curr2);
					tempArray[x2][y2] = new Ground[z];
					for(int z2=0;z2<z;++z2){
						Object curr3 = Array.get(curr2, z2);
						if(curr3==null)
							continue;
						tempArray[x2][y2][z2] = new Ground(curr3);
					}
				}
			}
			return tempArray;
		}
		return new Ground[][][]{};
	}
}
