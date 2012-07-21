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

public class RenderLD {
	public Object currentObject;
	public ClassHook currentHook;
	public static float absoluteX=(float) 260.0;
	public static float absoluteY=(float) 171.0;
	public static float xMultiplier=(float) 256.0;
	public static float yMultiplier=(float) 167.0;
	public RenderLD(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("RenderLD");
	}
	public Render getRender(){
		return new Render(currentObject);
	}
	public float getAbsoluteX(){
		return absoluteX;
		/*Object data = currentHook.getData("getAbsoluteX", currentObject);
		if(data!=null)
			return Float.parseFloat(data.toString());
		return -1;*/
	}
	public float getAbsoluteY(){
		return absoluteY;
		/*Object data = currentHook.getData("getAbsoluteY", currentObject);
		if(data!=null)
			return Float.parseFloat(data.toString());
		return -1;*/
	}
	public float getXMultiplier(){
		return xMultiplier;
		/*Object data = currentHook.getData("getXMultiplier", currentObject);
		if(data!=null)
			return Float.parseFloat(data.toString());
		return -1;*/
	}
	public float getYMultiplier(){
		return yMultiplier;
		/*Object data = currentHook.getData("getYMultiplier", currentObject);
		if(data!=null)
			return Float.parseFloat(data.toString());
		return -1;*/
	}
	public Viewport getViewport(){
		Object data = currentHook.getData("getViewport", currentObject);
		if(data!=null)
			return new Viewport(data);
		return null;
	}
}
