package com.icss.vdms.sys.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icss.vdms.sys.bean.VdmsClientBean;
import com.icss.vdms.sys.bean.VdmsClientCameraBean;
import com.icss.vdms.sys.service.SysService;
import com.icss.vdms.util.bean.Page;
import com.icss.vdms.util.bean.Result;
import com.icss.vdms.util.unique.MyUnique;

@Controller("sysControl")
@RequestMapping("/Sys/")
public class SysControl {

	// SysService
	private SysService sysService;
	
	//客户端操作
	
	@RequestMapping("doSaveClient")
	@ResponseBody
	public Result doSaveClient(@ModelAttribute VdmsClientBean vdmsClientBean){
		
		//设置UUID
		vdmsClientBean.setcUuid(MyUnique.getUUID());
		
		Result r = new Result();
		
		if(sysService.doInsertClient(vdmsClientBean) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("保存失败");
		}
		return r;
	}
	
	@RequestMapping("getClientList")
	@ResponseBody
	public Map<String, Object> getClientList(@ModelAttribute Page page){

		List<VdmsClientBean> modelList = sysService.doSelectModelList();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("total", sysService.doSelectModelCount());
		map.put("rows", modelList);
		
		return map;
		
	}
	
	@RequestMapping("getClientCameraList")
	@ResponseBody
	public List<VdmsClientCameraBean> getClientCameraList(@RequestParam String ccUuid){
		return sysService.doSelectClientCameraList(ccUuid);
	}
	
	//客户端摄像头操作
	@RequestMapping("doSaveClientCamera")
	@ResponseBody
	public Result doSaveClientCamera(@ModelAttribute VdmsClientCameraBean vdmsClientCameraBean){
	
		Result r = new Result();
		
		if(sysService.doInsertClientCamera(vdmsClientCameraBean) > 0){
			r.setSuccess(true);
		}else{
			r.setSuccess(false);
			r.setErrorMsg("保存失败");
		}
		
		return r;
		
	}
	
	/*******************************************************
	 * 
	 * 以下是自动注入信息
	 * 
	 *******************************************************/
	
	public SysService getSysService() {
		return sysService;
	}
	
	@Autowired
	public void setSysService(SysService sysService) {
		this.sysService = sysService;
	}
	
}
