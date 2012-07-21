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

public class ModelLD {
	public Object currentObject;
	public ClassHook currentHook;
	public ModelLD(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("ModelLD");
	}
	public Model getModel(){
		return new Model(currentObject);
	}
	public int[] getVerticiesX(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getVerticiesX")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (int[])data;
			}
		}		
		return new int[]{};
	}
	public int[] getVerticiesY(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getVerticiesY")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (int[])data;
			}
		}		
		return new int[]{};
	}
	public int[] getVerticiesZ(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getVerticiesZ")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (int[])data;
			}
		}		
		return new int[]{};
	}
	public short[] getTriangleX(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getTriangleX")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (short[])data;
			}
		}		
		return new short[]{};
	}
	public short[] getTriangleY(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getTriangleY")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (short[])data;
			}
		}		
		return new short[]{};
	}
	public short[] getTriangleZ(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getTriangleZ")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (short[])data;
			}
		}		
		return new short[]{};
	}
	public short[] getTriangleColor(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getTriangleColor")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (short[])data;
			}
		}		
		return new short[]{};
	}
}
