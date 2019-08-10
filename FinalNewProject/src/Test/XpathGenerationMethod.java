package Test;

public class XpathGenerationMethod extends TestController{


	public static String GetXpathForElements(String Keyword, String LocatorValue){
		String str="";
		//System.out.println("keyword is called "+Keyword);
		log.debug("keyword is called "+Keyword);
		
		//System.out.println("LocatorValue is GETXPATH "+LocatorValue);
		log.debug("LocatorValue is GETXPATH "+LocatorValue);
		
		
		if(Keyword.toLowerCase().trim().equals("textbox_click")){
			//System.out.println("textbox is called "+str);
			log.debug("textbox is called "+str);
			
			str=String.format("//input[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("textbox called "+str);
			log.debug("textbox called "+str);

		}
		if(Keyword.toLowerCase().trim().equals("textbox")){
			//System.out.println("textbox is called "+str);
			log.debug("textbox is called "+str);
			
			str=String.format("//input[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("textbox called "+str);
			log.debug("textbox called "+str);

		}
		else if(Keyword.toLowerCase().trim().equals("buttonwithinputtag")){
			//System.out.println("RadioButton is called "+str);
			log.debug("ButtonWithInputTag is called "+str);
			
			str=String.format("//input[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("RadioButton called "+str);
			log.debug("ButtonWithInputTag called "+str);

		}
		else if(Keyword.toLowerCase().trim().equals("radiobutton")){
			//System.out.println("RadioButton is called "+str);
			log.debug("RadioButton is called "+str);
			
			str=String.format("//input[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("RadioButton called "+str);
			log.debug("RadioButton called "+str);

		}
		else if(Keyword.toLowerCase().trim().equals("checkbox")){
			//System.out.println("CheckBox is called "+str);
			log.debug("CheckBox is called "+str);
			
			str=String.format("//input[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("CheckBox called "+str);
			log.debug("CheckBox called "+str);

		}
		else if(Keyword.toLowerCase().trim().equals("singleselectdropdown")){

			//System.out.println("XPATH SingleSelectDropdown is called "+str);
			log.debug("XPATH SingleSelectDropdown is called "+str);
			
			//select[@name='Productname']/ancestor::span[1]
			str= String.format("//select[@name='"+"%1$s"+"']/ancestor::span[1]", LocatorValue);

		}
		else if (Keyword.toLowerCase().trim().equals("multiselectdropdown")){

			//System.out.println("MultiSelectDropdown called "+str);
			log.debug("MultiSelectDropdown called "+str);
			
			//select[@name='ProductName']/ancestor::div[1]
			str= String.format("//select[@name='"+"%1$s"+"']/ancestor::div[1]", LocatorValue);

		}
		else if(Keyword.toLowerCase().trim().equals("link")){
			//System.out.println("Link is called");
			log.debug("Link is called");
			
			//*[.='Addnew']
			str=String.format("//*[.='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("xpath expression is: "+str);
			log.debug("xpath expression is: "+str);
		}
		/*else if(Keyword.toLowerCase().trim().equals("menu")){
			//System.out.println("Menu is called");
			log.debug("Menu is called");
			
			//a[.='Dashboard']
			str=String.format("//a[.='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("xpath expression is: "+str);
			log.debug("xpath expression is: "+str);
			
		}*/
		else if(Keyword.toLowerCase().trim().equals("button")){
			//System.out.println("Button is called");
			log.debug("Button is called");
			
			str=String.format("//button[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("Button called");
			log.debug("Button called");
		}
		else if(Keyword.toLowerCase().trim().equals("tab")){
			//System.out.println("Tab is called");
			log.debug("Tab is called");
			
			//a[.='Artwork Upload']/ancestor::li
			str=String.format("//a[.='"+"%1$s"+"']/ancestor::li", LocatorValue);
			
			//System.out.println("Tab called");
			log.debug("Tab called");
		}
		else if(Keyword.toLowerCase().trim().equals("textarea")){
			//System.out.println("TextArea is Called");
			log.debug("TextArea is Called");
			
			//textarea[@name="GLAMS Description"]
			str=String.format("//textarea[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("Textarea called");
			log.debug("Textarea called");
			
		}
		else if(Keyword.toLowerCase().trim().equals("dropdown")){
			//System.out.println("Dropdown is Called");
			log.debug("Dropdown is Called");
			
			//select[@name="edit"]
			str=String.format("//select[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("Dropdown Called");
			log.debug("Dropdown Called");
		}
		else if(Keyword.toLowerCase().trim().equals("linkitem_rowbutton")){
			//System.out.println("LinkItem_RowButton is Called");
			log.debug("LinkItem_RowButton is Called");
			
			str=String.format("//span[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("LinkItem_RowButton  Called");
			log.debug("LinkItem_RowButton  Called");
		}
		else if(Keyword.toLowerCase().trim().equals("linkitem_formbutton")){
			//System.out.println("LinkItem_FormButton is Called");
			log.debug("LinkItem_FormButton is Called");
			
			//button[@name="Download Artwork Group Files"]
			str=String.format("//button[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("LinkItem_FormButton Called");
			log.debug("LinkItem_FormButton Called");
		}
		else if(Keyword.toLowerCase().trim().equals("linkitem_groupbutton")){
			
			//System.out.println("LinkItem_GroupButton is Called");
			log.debug("LinkItem_GroupButton is Called");
			
			//a[@name="Unlink"]
			str=String.format("//a[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("LinkItem_GroupButton Called");
			log.debug("LinkItem_GroupButton Called");
		}
		else if(Keyword.toLowerCase().trim().equals("executebulkrequest_button")){
			//System.out.println("ExecuteBulkRequest_Button is Called");
			log.debug("ExecuteBulkRequest_Button is Called");
			
			//button[@name="CustomControl_ExecuteBulkRequestButton"]
			str=String.format("//button[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("ExecuteBulkRequest_Button Called");
			log.debug("ExecuteBulkRequest_Button Called");
		}
		else if(Keyword.toLowerCase().trim().equals("clearinputtext")){
			//System.out.println("ClearInputText is Called");
			log.debug("ClearInputText is Called");
			
			//input[@name="UserName"]
			str=String.format("//input[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("ClearInputText Called");
			log.debug("ClearInputText Called");
		}
		else if(Keyword.toLowerCase().trim().equals("kendogrids_actionbuttons")){
			//System.out.println("ClearInputText is Called");
			log.debug("KendoGrids_ActionButtons is Called");
			
			//input[@name="UserName"]
			//span[@name="Edit Roles"])
			str=String.format("//span[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("ClearInputText Called");
			log.debug("KendoGrids_ActionButtons Called");
		}
		else if(Keyword.toLowerCase().trim().equals("kendogrids_groupbuttons")){
			//System.out.println("ClearInputText is Called");
			log.debug("KendoGrids_GroupButtons is Called");
			
			//input[@name="UserName"]
			//span[@name="Edit Roles"])
			str=String.format("//a[@name='"+"%1$s"+"']", LocatorValue);
			
			//System.out.println("ClearInputText Called");
			log.debug("KendoGrids_GroupButtons Called");
		}
		else if(Keyword.toLowerCase().trim().equals("radiobutton_noaccess")){
			//System.out.println("ClearInputText is Called");
			log.debug("RadioButton_NoAccess is Called");
			
			//input[@name="UserName"]
			//span[@name="Edit Roles"])
			str=String.format("(//input[@name='"+"%1$s"+"'])[1]", LocatorValue);
			
			//System.out.println("ClearInputText Called");
			log.debug("RadioButton_NoAccess Called");
		}
		else if(Keyword.toLowerCase().trim().equals("radiobutton_readonly")){
			//System.out.println("ClearInputText is Called");
			log.debug("RadioButton_ReadOnly is Called");
			
			//input[@name="UserName"]
			//span[@name="Edit Roles"])
			str=String.format("(//input[@name='"+"%1$s"+"'])[2]", LocatorValue);
			
			//System.out.println("ClearInputText Called");
			log.debug("RadioButton_ReadOnly Called");
		}
		else if(Keyword.toLowerCase().trim().equals("radiobutton_fullaccess")){
			//System.out.println("ClearInputText is Called");
			log.debug("RadioButton_FullAccess is Called");
			
			//input[@name="UserName"]
			//span[@name="Edit Roles"])
			str=String.format("(//input[@name='"+"%1$s"+"'])[3]", LocatorValue);
			
			//System.out.println("ClearInputText Called");
			log.debug("RadioButton_FullAccess Called");
		}
		

		return str;
	}

	public static String GetXpathForDropdownValue(String Keyword,String TestData)
	{
		String str="";
		//System.out.println(" keyword for DropdownValue is called "+Keyword);
		log.debug(" keyword for DropdownValue is called "+Keyword);
		//System.out.println("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		log.debug("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		//System.out.println("TestData for DropdownValue is called, "+TestData);
		log.debug("TestData for DropdownValue is called, "+TestData);
		//else if (Keyword=="DropdownSelect")//for selecting dropdown value
		if(Keyword.toLowerCase().trim().equals("dropdownvalue"))
		{
			//System.out.println("DropdownSelect called "+str);
			log.debug("DropdownSelect called "+str);
			//*[@id=.//*[@id='{{item.Id}}_listbox']/li[.='TestData']
			str= String.format(".//*[@id='{{item.Id}}_listbox']/li[.='"+"%1$s"+"']", TestData);
			
		}


		System.out.println("xpath expression is: "+str);
		log.debug("xpath expression is: "+str);
		return str;
	}

	public static String GetXpathForManageDataAttributes(String Keyword){
		String str="";
		if(Keyword.toLowerCase().trim().equals("dropdownvalueattributes")){
			//System.out.println("DropdownValue Attributes is called");
			log.debug("DropdownValue Attributes is called");
			str=String.format(".//*[@id='{{item.Id}}_listbox']/li[3]/table/tbody/tr/th");
			//System.out.println("Dropdownvalue Attributes Called");
			log.debug("Dropdownvalue Attributes Called");
		}
		return str;

	}
	
	public static String WindowHeader_Icons(String Keyword){
		String WindowHeader_Refresh="";
		String WindowHeader_Close="";
		if(Keyword.toLowerCase().trim().equals("windowheader_refresh")){
			
			//System.out.println("WindowHeader_Refresh is Called");
			log.debug("WindowHeader_Refresh is Called");
			WindowHeader_Refresh=String.format("//button[@class='refresh']");
			return String.format("//button[@class='refresh']");
			
		}else if(Keyword.toLowerCase().trim().equals("windowheader_close")){
			
			//System.out.println("WindowHeader_Close is Called");
			log.debug("WindowHeader_Close is Called");
			WindowHeader_Close=String.format("//button[@name='close']");
			return String.format("//button[@name='close']");
			}
		return "";
	}
	public static String GetXpathForMyTaskGridFunctions(String Keyword){
		String ReAssign_MyTaskGrid="";
		String ExportToExcel_MyTasksGrid="";
		String Edit_MyTasksGrid="";
		if(Keyword.toLowerCase().trim().equals("reassign_mytaskgrid")){
			
			//System.out.println("GetXpath for ReAssign_MyTaskGrid is called");
			log.debug("GetXpath for ReAssign_MyTaskGrid is called");
			ReAssign_MyTaskGrid=String.format("(//a[@name='ReAssign'])[1]");
			return String.format("(//a[@name='ReAssign'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("exporttoexcel_mytasksgrid")){
			
			//System.out.println("GetXpath for ExportToExcel_MyTasksGrid is called");
			log.debug("GetXpath for ExportToExcel_MyTasksGrid is called");
			ExportToExcel_MyTasksGrid=String.format("(//a[@name='ExportToExcel'])[1]");
			return String.format("(//a[@name='ExportToExcel'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("edit_mytasksgrid")){
			
			//System.out.println("GetXpath for Edit_MyTasksGrid is Called");
			log.debug("GetXpath for Edit_MyTasksGrid is Called");
			Edit_MyTasksGrid=String.format("(//a[@name='Edit'])[1]");
			return String.format("(//a[@name='Edit'])[1]");
		}
		return "";
	}
	
	public static String GetXpathForGroupTaskGridFunctions(String Keyword){
		String ReAssign_GroupTasksGrid="";
		String ExportToExcel_GroupTasksGrid="";
		String AssignToMe_GroupTaskGrid="";
		String Edit_GroupTasksGrid="";
		String DownloadFiles_GroupTasksGrid="";
		if(Keyword.toLowerCase().trim().equals("reassign_grouptasksgrid")){
			
			//System.out.println("Get Xpath for ReAssign_GroupTasksGrid is called");
			log.debug("Get Xpath for ReAssign_GroupTasksGrid is called");
			ReAssign_GroupTasksGrid=String.format("(//a[@name='ReAssign'])[2]");
			return String.format("(//a[@name='ReAssign'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("exporttoexcel_grouptasksgrid")){
			
			//System.out.println("Get Xpath for ExportToExcel_GroupTasksGrid is called");
			log.debug("Get Xpath for ExportToExcel_GroupTasksGrid is called");
			ExportToExcel_GroupTasksGrid=String.format("(//a[@name='ExportToExcel'])[2]");
			return String.format("(//a[@name='ExportToExcel'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("assigntome_grouptaskgrid")){
			
			//System.out.println("Get Xpath for AssignToMe_GroupTaskGrid is Called");
			log.debug("Get Xpath for AssignToMe_GroupTaskGrid is Called");
			AssignToMe_GroupTaskGrid=String.format("(//a[@name='AssignToMe'])[1]");
			return String.format("(//a[@name='AssignToMe'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("edit_grouptasksgrid")){
			
			//System.out.println("Get Xpath for Edit_GroupTasksGrid is called");
			log.debug("Get Xpath for Edit_GroupTasksGrid is called");
			Edit_GroupTasksGrid=String.format("(//a[@name='Edit'])[2]");
			return String.format("(//a[@name='Edit'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("downloadfiles_grouptasksgrid")){
			
			//System.out.println("Get Xpath for DownloadFiles_GroupTasksGrid is Called");
			log.debug("Get Xpath for DownloadFiles_GroupTasksGrid is Called");
			DownloadFiles_GroupTasksGrid=String.format("(//a[@name='Download Files'])[2]");
			return String.format("(//a[@name='Download Files'])[2]");
		}
		return "";
		
	}
	
	public static String GetXpathForRouting_Buttons(String Keyword){
		String Routing_BtnSubmit="";
		String Routing_BtnSave="";
		String Routing_BtnCancel="";
		if(Keyword.toLowerCase().trim().equals("routing_btnsubmit")){
			
			//System.out.println("CustomControl Routing Submit button is called");
			log.debug("CustomControl Routing Submit button is called");
			Routing_BtnSubmit=String.format("//button[@k-options='submitButton']");
			return String.format("//button[@k-options='submitButton']");
			
		}else if(Keyword.toLowerCase().trim().equals("routing_btncancel")){
			
			//System.out.println("Customcontrol_Routing cancel button is called");
			log.debug("Customcontrol_Routing cancel button is called");
			Routing_BtnCancel=String.format("//button[@k-options='cancelButton']");
			return String.format("//button[@k-options='cancelButton']");
			
		}else if(Keyword.toLowerCase().trim().equals("routing_btnsave")){
			
			//System.out.println("Custom control Routing Save Button is called");
			log.debug("Custom control Routing Save Button is called");
			Routing_BtnSave=String.format("//button[@k-options='saveButton']");
			return String.format("//button[@k-options='saveButton']");
		}
		return "";
			
		}
	
	public static String JobTaskMap_Buttons(String Keyword){
		String JobTaskMap_Edit="";
		String JobTaskMap_Delete="";
		String JobTaskMap_GanttChart="";
		String JobTaskMap_Description="";
		if(Keyword.toLowerCase().trim().equals("jobtaskmap_edit")){
			
			//System.out.println("JobTaskMap Customcontrol Edit Button is Called");
			log.debug("JobTaskMap Customcontrol Edit Button is Called");
			JobTaskMap_Edit=String.format("(//span[@name='Edit'])[1]");
			return String.format("//span[@name='Edit']");
			
		}else if(Keyword.toLowerCase().trim().equals("jobtaskmap_delete")){
			
			//System.out.println("JobTaskMap Customcontrol delete button is Called");
			log.debug("JobTaskMap Customcontrol delete button is Called");
			JobTaskMap_Delete=String.format("//a[@name='Delete']");
			return String.format("//a[@name='Delete']");
			
		}else if(Keyword.toLowerCase().trim().equals("jobtaskmap_ganttchart")){
			
			//System.out.println("JobTaskMap Customcontrol Gantt chart Button is Called");
			log.debug("JobTaskMap Customcontrol Gantt chart Button is Called");
			JobTaskMap_GanttChart=String.format("//a[@name='Gantt Chart']");
			return String.format("//a[@name='Gantt Chart']");
			
		}else if(Keyword.toLowerCase().trim().equals("jobtaskmap_description")){
			
			//System.out.println("JobTaskMap_Description is Called");
			log.debug("JobTaskMap_Description is Called");
			JobTaskMap_Description=String.format("(//textarea[@name='reason'])[2]");
			return String.format("(//textarea[@name='reason'])[2]");
			
		}
		return "";
	}
	
	public static String StateFilter_MyTasksFunctions(String Keyword){
		String MyTasks_StateFilter_OverDue="";
		String MyTasks_StateFilter_LessthanHrs="";
		String MyTasks_StateFilter_OnTime="";
		String MyTasks_StateFilter_Hold="";
		if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_overdue")){
			
			//System.out.println("MyTasks_StateFilter_OverDue is Called");
			log.debug("MyTasks_StateFilter_OverDue is Called");
			MyTasks_StateFilter_OverDue=String.format("(//a[@class='taskGrid overdue-state ng-scope'])[1]");
			return String.format("(//a[@class='taskGrid overdue-state ng-scope'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_lessthanhrs")){
			
			//System.out.println("MyTasks_StateFilter_LessthanHrs is Called");
			log.debug("MyTasks_StateFilter_LessthanHrs is Called");
			MyTasks_StateFilter_LessthanHrs=String.format("(//a[@class='taskGrid lessthan-state ng-scope'])[1]");
			return String.format("(//a[@class='taskGrid lessthan-state ng-scope'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_ontime")){
			
			//System.out.println("MyTasks_StateFilter_OnTime is Called");
			log.debug("MyTasks_StateFilter_OnTime is Called");
			MyTasks_StateFilter_OnTime=String.format("(//a[@class='taskGrid ontime-state ng-scope'])[1]");
			return String.format("(//a[@class='taskGrid ontime-state ng-scope'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("mytasks_statefilter_hold")){
			
			//System.out.println("MyTasks_StateFilter_Hold is Called");
			log.debug("MyTasks_StateFilter_Hold is Called");
			MyTasks_StateFilter_Hold=String.format("(//a[@class='taskGrid hold-state ng-scope'])[1]");
			return String.format("(//a[@class='taskGrid hold-state ng-scope'])[1]");
			
			}
		return "";
		
	}
	
	public static String StateFilter_GroupTaskFunctions(String Keyword){
		String GroupTasks_StateFilter_OverDue="";
		String GroupTasks_StateFilter_LessthanHrs="";
		String GroupTasks_StateFilter_OnTime="";
		String GroupTasks_StateFilter_Hold="";
		if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_overdue")){
			
			//System.out.println("GroupTasks_StateFilter_OverDue is Called");
			log.debug("GroupTasks_StateFilter_OverDue is Called");
			GroupTasks_StateFilter_OverDue=String.format("(//a[@class='taskGrid overdue-state ng-scope'])[2]");
			return String.format("(//a[@class='taskGrid overdue-state ng-scope'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_lessthanhrs")){
			
			//System.out.println("GroupTasks_StateFilter_LessthanHrs is Called");
			log.debug("GroupTasks_StateFilter_LessthanHrs is Called");
			GroupTasks_StateFilter_LessthanHrs=String.format("(//a[@class='taskGrid lessthan-state ng-scope'])[2]");
			return String.format("(//a[@class='taskGrid lessthan-state ng-scope'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_ontime")){
			
			//System.out.println("GroupTasks_StateFilter_OnTime is Called");
			log.debug("GroupTasks_StateFilter_OnTime is Called");
			GroupTasks_StateFilter_OnTime=String.format("(//a[@class='taskGrid ontime-state ng-scope'])[2]");
			return String.format("(//a[@class='taskGrid ontime-state ng-scope'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasks_statefilter_hold")){
			
			//System.out.println("GroupTasks_StateFilter_Hold is Called");
			log.debug("GroupTasks_StateFilter_Hold is Called");
			GroupTasks_StateFilter_Hold=String.format("(//a[@class='taskGrid hold-state ng-scope'])[2]");
			return String.format("(//a[@class='taskGrid hold-state ng-scope'])[2]");
			}
		return "";
		
	}
	public static String MyTasks_GridFilter_ActionButtons(String Keyword){
		String MyTasks_GridFilter="";
		String MyTasksGridFilter_DefaultButton="";
		String MyTasksGridFilter_ApplyButton="";
		String MyTasksGridFilter_ClearButton="";
		String MyTasksGridFilter_SaveButton="";
		
		if(Keyword.toLowerCase().trim().equals("mytasks_gridfilter")){
			//System.out.println("MyTasks_GridFilter is Called");
			log.debug("MyTasks_GridFilter is Called");
			MyTasks_GridFilter=String.format("(//a[@name='grid_filters'])[1]");
			return String.format("(//a[@name='grid_filters'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_defaultbutton")){
			//System.out.println("MyTasksGridFilter_DefaultButton is Called");
			log.debug("MyTasksGridFilter_DefaultButton is Called");
			MyTasksGridFilter_DefaultButton=String.format("//a[@ng-click='filter.setAsDefault=!filter.setAsDefault']");
			return String.format("//a[@ng-click='filter.setAsDefault=!filter.setAsDefault']"); 
			
		}else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_applybutton")){
			//System.out.println("MyTasksGridFilter_ApplyButton is Called");
			log.debug("MyTasksGridFilter_ApplyButton is Called");
			MyTasksGridFilter_ApplyButton=String.format("//a[.='Apply']");
			return String.format("//a[.='Apply']");
			}
		else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_clearbutton")){
				
			//System.out.println("MyTasksGridFilter_ClearButton is Called");
			log.debug("MyTasksGridFilter_ClearButton is Called");
			MyTasksGridFilter_ClearButton=String.format("//a[.='Clear']");
			return String.format("//a[.='Clear']");
				}
		else if(Keyword.toLowerCase().trim().equals("mytasksgridfilter_savebutton")){
			//System.out.println("MyTasksGridFilter_SaveButton is Called");
			log.debug("MyTasksGridFilter_SaveButton is Called");
			MyTasksGridFilter_SaveButton=String.format("//a[@ng-click='filter.saveFilter()'']");
			return String.format("//a[@ng-click='filter.saveFilter()'']");
			
			
		}
		return "";
		
	}
	
	public static String GroupTasks_GridFilter_ActionButtons(String Keyword){
		String GroupTasks_GridFilter="";
		String GroupTasksGridFilter_DefaultButton="";
		String GroupTasksGridFilter_ApplyButton="";
		String GroupTasksGridFilter_ClearButton="";
		String GroupTasksGridFilter_SaveButton="";
		
        if(Keyword.toLowerCase().trim().equals("grouptasks_gridfilter")){
        	//System.out.println("GroupTasks_GridFilter is Called");
        	log.debug("GroupTasks_GridFilter is Called");
        	GroupTasks_GridFilter=String.format("(//a[@name='grid_filters'])[2]");
			return String.format("(//a[@name='grid_filters'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_defaultbutton")){
			//System.out.println("GroupTasksGridFilter_DefaultButton is Called");
			log.debug("GroupTasksGridFilter_DefaultButton is Called");
			GroupTasksGridFilter_DefaultButton=String.format("//a[@ng-click='filter.setAsDefault=!filter.setAsDefault']");
			return String.format("//a[@ng-click='filter.setAsDefault=!filter.setAsDefault']"); 
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_applybutton")){
			//System.out.println("GroupTasksGridFilter_ApplyButton is Called");
			log.debug("GroupTasksGridFilter_ApplyButton is Called");
			GroupTasksGridFilter_ApplyButton=String.format("//a[.='Apply']");
			return String.format("//a[.='Apply']");
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_clearbutton")){
			//System.out.println("GroupTasksGridFilter_ClearButton is Called");
			log.debug("GroupTasksGridFilter_ClearButton is Called");
			GroupTasksGridFilter_ClearButton=String.format("//a[.='Clear']");
			return String.format("//a[.='Clear']");
			
		}else if(Keyword.toLowerCase().trim().equals("grouptasksgridfilter_savebutton")){
			//System.out.println("GroupTasksGridFilter_SaveButton is Called");
			log.debug("GroupTasksGridFilter_SaveButton is Called");
			GroupTasksGridFilter_SaveButton=String.format("//a[@ng-click='filter.saveFilter()'']");
			return String.format("//a[@ng-click='filter.saveFilter()'']");
			
		}
        return "";
		
	}
	
	public static String TrackerRepository_GridFilter_ActionButtons(String Keyword){
		String TrackerRepository_GridFilter="";
		String TrackerRepositoryGridFilter_DefaultButton="";
		String TrackerRepositoryGridFilter_ApplyButton="";
		String TrackerRepositoryGridFilter_ClearButton="";
		String TrackerRepositoryGridFilter_SaveButton="";
		
        if(Keyword.toLowerCase().trim().equals("trackerrepository_gridfilter")){
        	//System.out.println("TrackerRepository_GridFilter is Called");
        	log.debug("TrackerRepository_GridFilter is Called");
        	TrackerRepository_GridFilter=String.format("(//a[@name='grid_filters'])[1]");
			return String.format("(//a[@name='grid_filters'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_defaultbutton")){
			//System.out.println("TrackerRepositoryGridFilter_DefaultButton is Called");
			log.debug("TrackerRepositoryGridFilter_DefaultButton is Called");
			TrackerRepositoryGridFilter_DefaultButton=String.format("//a[@ng-click='filter.setAsDefault=!filter.setAsDefault']");
			return String.format("//a[@ng-click='filter.setAsDefault=!filter.setAsDefault']");
			
		}else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_applybutton")){
			//System.out.println("TrackerRepositoryGridFilter_ApplyButton is Called");
			log.debug("TrackerRepositoryGridFilter_ApplyButton is Called");
			TrackerRepositoryGridFilter_ApplyButton=String.format("//a[.='Apply']");
			return String.format("//a[.='Apply']");
			
		}else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_clearbutton")){
			//System.out.println("TrackerRepositoryGridFilter_ClearButton is Called");
			log.debug("TrackerRepositoryGridFilter_ClearButton is Called");
			TrackerRepositoryGridFilter_ClearButton=String.format("//a[.='Clear']");
			return String.format("//a[.='Clear']");
			
		}else if(Keyword.toLowerCase().trim().equals("trackerrepositorygridfilter_savebutton")){
			//System.out.println("TrackerRepositoryGridFilter_SaveButton is Called");
			log.debug("TrackerRepositoryGridFilter_SaveButton is Called");
			TrackerRepositoryGridFilter_SaveButton=String.format("//a[@ng-click='filter.saveFilter()'']");
			return String.format("//a[@ng-click='filter.saveFilter()'']");
			
		}
		return "";
	}
	
	public static String StateFilter_TrackerFunctions(String Keyword){
		String Tracker_StateFilter_OverDue="";
		String Tracker_StateFilter_LessthanHrs="";
		String Tracker_StateFilter_OnTime="";
		String Tracker_StateFilter_Hold="";
		if(Keyword.toLowerCase().trim().equals("tracker_statefilter_overdue")){
			
			//System.out.println("Tracker_StateFilter_OverDue is Called");
			log.debug("Tracker_StateFilter_OverDue is Called");
			Tracker_StateFilter_OverDue=String.format("//a[@class='taskGrid overdue-state ng-scope']");
			return String.format("//a[@class='taskGrid overdue-state ng-scope']");
			
		}else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_lessthanhrs")){
			//System.out.println("Tracker_StateFilter_LessthanHrs is Called");
			log.debug("Tracker_StateFilter_LessthanHrs is Called");
			Tracker_StateFilter_LessthanHrs=String.format("//a[@class='taskGrid lessthan-state ng-scope']");
			return String.format("//a[@class='taskGrid lessthan-state ng-scope']");
			
		}else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_ontime")){
			//System.out.println("Tracker_StateFilter_OnTime is Called");
			log.debug("Tracker_StateFilter_OnTime is Called");
			Tracker_StateFilter_OnTime=String.format("//a[@class='taskGrid ontime-state ng-scope']");
			return String.format("//a[@class='taskGrid ontime-state ng-scope']");
			
			
		}else if(Keyword.toLowerCase().trim().equals("tracker_statefilter_hold")){
			//System.out.println("Tracker_StateFilter_Hold is Called");
			log.debug("Tracker_StateFilter_Hold is Called");
			Tracker_StateFilter_Hold=String.format("//a[@class='taskGrid hold-state ng-scope']");
			return String.format("//a[@class='taskGrid hold-state ng-scope']");
			
		}
		return "";
		
	}
	
	public static String StateFilter_RepositoryFunctions(String Keyword){
		String Repository_StateFilter_Active="";
		String Repository_StateFilter_Locked="";
		if(Keyword.toLowerCase().trim().equals("repository_statefilter_active")){
			
			//System.out.println("Repository_StateFilter_Active is Called");
			log.debug("Repository_StateFilter_Active is Called");
			Repository_StateFilter_Active=String.format("//a[@class='taskGrid active-state ng-scope']");
			return String.format("//a[@class='taskGrid active-state ng-scope']");
			
		}else if(Keyword.toLowerCase().trim().equals("repository_statefilter_locked")){
			
			//System.out.println("Repository_StateFilter_Locked is Called");
			log.debug("Repository_StateFilter_Locked is Called");
			Repository_StateFilter_Locked=String.format("//a[@class='taskGrid locked-state ng-scope']");
			return String.format("//a[@class='taskGrid locked-state ng-scope']");
			
			
			
		}
		return "";
		
	}
	
	public static String Handling_AlertButtons(String Keyword){
		String Handling_WindowAlert_Yes="";
		String Handling_WindowAlert_No="";
		String Handling_WindowAlert_Cancel="";
		String Handling_WindowAlert_Ok="";
		
		if(Keyword.toLowerCase().trim().equals("handling_windowalert_yes")){
			
			//System.out.println("Handling_WindowAlert_Yes is Called");
			log.debug("Handling_WindowAlert_Yes is Called");
			Handling_WindowAlert_Yes=String.format("//input[@name='Yes']");
			return String.format("//input[@name='Yes']");
			
		}else if(Keyword.toLowerCase().trim().equals("handling_windowalert_no")){
			
			//System.out.println("Handling_WindowAlert_No is Called");
			log.debug("Handling_WindowAlert_No is Called");
			Handling_WindowAlert_No=String.format("//input[@name='No']");
			return String.format("//input[@name='No']");
			}
		else if(Keyword.toLowerCase().trim().equals("handling_windowalert_cancel")){
			//System.out.println("Handling_WindowAlert_Cancel is Called");
			log.debug("Handling_WindowAlert_Cancel is Called");
			Handling_WindowAlert_Cancel=String.format("//input[@name='Cancel']");
			return String.format("//input[@name='Cancel']");
		}
		else if(Keyword.toLowerCase().trim().equals("handling_windowalert_ok")){
			//System.out.println("Handling_WindowAlert_Ok is Called");
			log.debug("Handling_WindowAlert_Ok is Called");
			Handling_WindowAlert_Ok=String.format("//input[@name='Ok']");
			return String.format("//input[@name='Ok']");
		}
		return "";
	}
	
	public static String GetXpathForDownloadCustomControl_Buttons(String Keyword){
		String DownloadCC_Upload="";
		String DownloadCC_SendMail="";
		String DownloadCC_Download="";
		String DownloadCC_MakeInActive="";
		String DownloadCC_Edit="";
		if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_upload")){
			
			//System.out.println("GetXpath for DownloadCC_Upload is Called");
			log.debug("GetXpath for DownloadCC_Upload is Called");
			DownloadCC_Upload=String.format("//button[@name='upload']");
			return String.format("//button[@name='upload']");
			
		}else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_download")){
			
			//System.out.println("GetXpath for DownloadCC_Download is called");
			log.debug("GetXpath for DownloadCC_Download is called");
			DownloadCC_Download=String.format("//button[@name='download']");
			return String.format("//button[@name='download']");
			
		}else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_sendmail")){
			
			//System.out.println("GetXpath for DownloadCC_Sendmail is called");
			log.debug("GetXpath for DownloadCC_Sendmail is called");
			DownloadCC_SendMail=String.format("//button[@name='sentmail']");
			return String.format("//button[@name='sentmail']");
			
		}else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_makeinactive")){
			
			//System.out.println("GetXpath for DownloadCC_MakeInactive is Called");
			log.debug("GetXpath for DownloadCC_MakeInactive is Called");
			DownloadCC_MakeInActive=String.format("(//span[@name='Make Inactive'])[1]");
			return String.format("(//span[@name='Make Inactive'])[1]");
			
			}else if(Keyword.toLowerCase().trim().equals("downloadcustomcontrol_edit")){
				
				//System.out.println("GetXpath for DownloadCC_Edit is called");
				log.debug("GetXpath for DownloadCC_Edit is called");
				DownloadCC_Edit=String.format("(//span[@name='Edit'])[1]");
				return String.format("(//span[@name='Edit'])[1]");
			}
		 return "";
			}
	         


	public static String ClickAndSelectSingleSelectDropdown(String Keyword, String LocatorValue, String TestData,int index){
		//String str="";
		String SingleSelectDropdown="";
		String DropdownValue="";
		
		//System.out.println(" keyword for DropdownValue is called "+Keyword);
		log.debug(" keyword for DropdownValue is called "+Keyword);
		//System.out.println("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		log.debug("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		//System.out.println("TestData for DropdownValue is called, "+TestData);
		log.debug("TestData for DropdownValue is called, "+TestData);
		if(Keyword.toLowerCase().trim().equals("clickandselectsingleselectdropdown")){
			//System.out.println("ClickAndSelectSingleSelectDropdown is Called");
			log.debug("ClickAndSelectSingleSelectDropdown is Called");
			if(index==0){
				SingleSelectDropdown=String.format("//select[@name='"+"%1$s"+"']/ancestor::span[1]", LocatorValue);
				//System.out.println("the sigleselectDropdown value xpath is "+SingleSelectDropdown);
				log.debug("the sigleselectDropdown value xpath is "+SingleSelectDropdown);
				return String.format("//select[@name='"+"%1$s"+"']/ancestor::span[1]", LocatorValue);
			}

			else{
				DropdownValue=String.format(".//*[@id='{{item.Id}}_listbox']/li[.='"+"%1$s"+"']", TestData);
				//System.out.println("The DropdownValue xpath is "+DropdownValue);
				log.debug("The DropdownValue xpath is "+DropdownValue);
				return String.format(".//*[@id='{{item.Id}}_listbox']/li[.='"+"%1$s"+"']", TestData);
			}
		}
			
		return "";
	}
	
	public static String ClickAndSelectMultiselectDropdown(String Keyword, String LocatorValue, String TestData,int index){
		String MultiSelectDropdown="";
		String DropDownValue="";
		
		//System.out.println(" keyword for DropdownValue is called "+Keyword);
		log.debug(" keyword for DropdownValue is called "+Keyword);
		//System.out.println("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		log.debug("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		//System.out.println("TestData for DropdownValue is called, "+TestData);
		log.debug("TestData for DropdownValue is called, "+TestData);
		if(Keyword.toLowerCase().trim().equals("clickandselectmultiselectdropdown")){
			//System.out.println("ClickAndSelectMultiselectDropdown is called");
			log.debug("ClickAndSelectMultiselectDropdown is called");
			if(index==0){
				MultiSelectDropdown= String.format("//select[@name='"+"%1$s"+"']/ancestor::div[1]", LocatorValue);
				//System.out.println("The multiselect dropdown xpath is "+MultiSelectDropdown);
				log.debug("The multiselect dropdown xpath is "+MultiSelectDropdown);
				return String.format("//select[@name='"+"%1$s"+"']/ancestor::div[1]", LocatorValue);
			}
			else {
				DropDownValue=String.format(".//*[@id='{{item.Id}}_listbox']/li[.='"+"%1$s"+"']", TestData);
				//System.out.println("The DropDownValue xpath is "+DropDownValue);
				log.debug("The DropDownValue xpath is "+DropDownValue);
				return String.format("//*[@role='listbox']/li[.='"+"%1$s"+"']", TestData);
				
			}
		}
		return "";
		
	}
	
	public static String ClickAndSelectMultiselectDropdownWithAttributes(String Keyword, String LocatorValue, String TestData,int index){
		String Multiselectdropdown ="";
		String ManageDataAttributes="";
		
		//System.out.println(" keyword for DropdownValue is called "+Keyword);
		log.debug(" keyword for DropdownValue is called "+Keyword);
		//System.out.println("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		log.debug("LocatorValue for DropdownValue is GETXPATH "+LocatorValue);
		//System.out.println("TestData for DropdownValue is called, "+TestData);
		log.debug("TestData for DropdownValue is called, "+TestData);
		if(Keyword.toLowerCase().trim().equals("clickandselectmultiselectwithattributes")){
			//System.out.println("clickandselectmultiselectwithattributes is called");
			log.debug("clickandselectmultiselectwithattributes is called");
	        if(index==0){
			Multiselectdropdown=String.format("//select[@name='"+"%1$s"+"']/ancestor::div[1]", LocatorValue);
			//System.out.println("The multiselect dropdown xpath is "+Multiselectdropdown);
			log.debug("The multiselect dropdown xpath is "+Multiselectdropdown);
			return String.format("//select[@name='"+"%1$s"+"']/ancestor::div[1]", LocatorValue);
			}
		else{
			
			ManageDataAttributes=String.format(".//*[@id='{{item.Id}}_listbox']/li[3]/table/tbody/tr/th");
			//System.out.println("Dropdownvalue Attributes Called "+ManageDataAttributes);
			log.debug("Dropdownvalue Attributes Called "+ManageDataAttributes);
			return String.format(".//*[@id='{{item.Id}}_listbox']/li[3]/table/tbody/tr/th");
			
		}
		}
		return "";
	}
	
	
	
	public static String MyTaskSearch(String Keyword, String LocatorValue, String TestData, int index){
		String MyTaskSearchBox="";
		String MyTaskSearchButton="";
		String ClickPartNumber="";
		if(Keyword.toLowerCase().trim().equals("mytasks_clickpartnumber")){
			
			if(index==0){
				//System.out.println("MyTaskGridSearch is Called");
				log.debug("MyTaskGridSearch is Called");
				MyTaskSearchBox=String.format("(//input[@name='grid_search_input'])[1]");
				return String.format("(//input[@name='grid_search_input'])[1]");
				}else if(index==1){
					//System.out.println("MyTaskSearchButton is Called");
					log.debug("MyTaskSearchButton is Called");
					MyTaskSearchButton=String.format("(//button[@name='grid_search_button'])[1]");
					return String.format("(//button[@name='grid_search_button'])[1]");
					}else if(index==2){
						//System.out.println("Click PartNumber is called");
						log.debug("Click PartNumber is called");
						//(//*[.='10-01'])[2]
						ClickPartNumber=String.format("(//a[@ng-click='rowActiveClick($event)'])[1]");
						return String.format("(//a[@ng-click='rowActiveClick($event)'])[1]");
					}
		}
		return "";
		
	}
	
	public static String GroupTaskSearch(String Keyword, String LocatorValue, String TestData, int index){
		String GroupTaskSearchBox="";
		String GroupTaskSearchButton="";
		String SelectRowValue="";
		if(Keyword.toLowerCase().trim().equals("grouptasksearch_selectrow")){
			if(index==0){
				//System.out.println("GroupTask Grid search is called");
				log.debug("GroupTask Grid search is called");
				GroupTaskSearchBox=String.format("(//input[@name='grid_search_input'])[2]");
				return String.format("(//input[@name='grid_search_input'])[2]");
			}else if(index==1){
				//System.out.println("GroupTask SearchButton is called");
				log.debug("GroupTask SearchButton is called");
				GroupTaskSearchButton=String.format("(//button[@name='grid_search_button'])[2]");
				return String.format("(//button[@name='grid_search_button'])[2]");
			}else if(index==2){
				//System.out.println("GroupTask Grid row is Called");
				log.debug("GroupTask Grid row is Called");
				SelectRowValue=String.format("((//div[@class='k-grid-content k-auto-scrollable'])[2]/table/tbody/tr/td[3])[1]");
				return String.format("((//div[@class='k-grid-content k-auto-scrollable'])[2]/table/tbody/tr)[1]");
				}
		}
		return "";
		
	}
	
	public static String DownloadCC_CategoryDropdown(String Keyword, String LocatorValue, String TestData, int index){
		String SingleSelectDropdown="";
		String DropdownValue="";
		
			//System.out.println("Keyword value for xpath "+Keyword);
			log.debug("Keyword value for xpath "+Keyword);
			//System.out.println("LocatorValue for xpath "+LocatorValue);
			log.debug("LocatorValue for xpath "+LocatorValue);
			//System.out.println("TestData value for xpath "+TestData);
			log.debug("TestData value for xpath "+TestData);
			if(Keyword.toLowerCase().trim().equals("downloadcc_category")){
			if(index==0){
				SingleSelectDropdown=String.format("//select[@name='"+"%1$s"+"']/ancestor::span[1]", LocatorValue);
				//System.out.println("the sigleselectDropdown value xpath is "+SingleSelectDropdown);
				log.debug("the sigleselectDropdown value xpath is "+SingleSelectDropdown);
				return String.format("//select[@name='"+"%1$s"+"']/ancestor::span[1]", LocatorValue);
			}
			else{
				//(//ul[@role="listbox"]/li[.='Brief'])[3]
				//DropdownValue=String.format("(//ul[@role='listbox']/li[.='"+"%1$s"+"'])[3]", TestData);
				DropdownValue=String.format("//ul[@role='listbox']/li[.='%1$s']", TestData);
				//System.out.println("the dropdown value for DropdownValue is "+DropdownValue);
				log.debug("the dropdown value for DropdownValue is "+DropdownValue);
				return String.format("//ul[@role='listbox']/li[.='%1$s']", TestData);
			}
			}
			return "";
		}
	
	public static String GridSearchFor_TrackerRepository(String Keyword, String LocatorValue, String TestData, int index){
		String GridSearchBox="";
		String GridSearchButton="";
		String ClickPartNumber="";
		if(Keyword.toLowerCase().trim().equals("gridsearchtrackerrepository_clickpartnumber")){
			
			if(index==0){
				//System.out.println("Tracker&Repository GridSearch is Called");
				log.debug("Tracker&Repository GridSearch is Called");
				GridSearchBox=String.format("(//input[@name='grid_search_input'])[1]");
				return String.format("(//input[@name='grid_search_input'])[1]");
				}else if(index==1){
					//System.out.println("Tracker&Repository GridSearchButton is Called");
					log.debug("Tracker&Repository GridSearchButton is Called");
					GridSearchButton=String.format("(//button[@name='grid_search_button'])[1]");
					return String.format("(//button[@name='grid_search_button'])[1]");
					}else if(index==2){
						//System.out.println("Click PartNumber is called");
						log.debug("Click PartNumber is called");
						//(//*[.='10-01'])[2]
						ClickPartNumber=String.format("(//a[@ng-click='rowActiveClick($event)'])[1]");
						return String.format("(//a[@ng-click='rowActiveClick($event)'])[1]");
					}
		}
		return "";
		
	}
	public static String GridSearch_CC_TrackerView(String Keyword, String LocatorValue, String TestData, int index){
		String GridSearch="";
		String SearchButton="";
		if(Keyword.toLowerCase().trim().equals("gridsearch_cc_trackerview")){
			if(index==0){
				//System.out.println("GridSearch is Called");
				log.debug("GridSearch is Called");
				GridSearch=String.format("(//input[@name='grid_search_input'])[2]");
				return String.format("(//input[@name='grid_search_input'])[2]");
			}else{
				//System.out.println("GridSearchButton is Called");
				log.debug("GridSearchButton is Called");
				SearchButton=String.format("(//button[@name='grid_search_button'])[2]");
				return String.format("(//button[@name='grid_search_button'])[2]");
				
				}
		}
	
	return "";
	}
	public static String GetXpathFor_CCActionButtons(String Keyword){
		String CustomControlActionButtons_Update="";
		String CustomControlActionButtons_Cancel="";
		String CustomControlActionButtons_Submit="";
		
		if(Keyword.toLowerCase().trim().equals("customcontrolactionbuttons_update")){
			
			//System.out.println("CustomControlActionButtons_Update is Called");
			log.debug("CustomControlActionButtons_Update is Called");
			CustomControlActionButtons_Update=String.format("//input[@name='Update']");
			return String.format("//input[@name='Update']");
			
		}else if(Keyword.toLowerCase().trim().equals("customcontrolactionbuttons_cancel")){
			
			//System.out.println("CustomControlActionButtons_Cancel is Called");
			log.debug("CustomControlActionButtons_Cancel is Called");
			CustomControlActionButtons_Cancel=String.format("//input[@name='Cancel']");
			return String.format("//input[@name='Cancel']");
			
			}else if(Keyword.toLowerCase().trim().equals("customcontrolactionbuttons_submit")){
				
				//System.out.println("CustomControlActionButtons_Submit is Called");
				log.debug("CustomControlActionButtons_Submit is Called");
				CustomControlActionButtons_Submit=String.format("//input[@name='Submit']");
				return String.format("//input[@name='Submit']");
			}
		return "";
	}
	
	public static String GroupTasks_GroupFilter(String Keyword, String LocatorValue, String TestData, int index){
		String GroupFilter_Dropdown="";
		String GroupFilter_DropdownValue="";
		
		if(Keyword.toLowerCase().trim().equals("grouptask_groupfilter")){
			if(index==0){
				//System.out.println("GroupFilter_Drodown is Called");
				log.debug("GroupFilter_Drodown is Called");
				GroupFilter_Dropdown=String.format("//select[@name='grid_groups']/ancestor::span[1]");
				return String.format("//select[@name='grid_groups']/ancestor::span[1]");
			}else if(index==1){
				//System.out.println("GroupFilter_DropdownValue is Called");
				log.debug("GroupFilter_DropdownValue is Called");
				//(//ul[@class='k-list k-reset']/li[.='Albania'])[1]
				GroupFilter_DropdownValue=String.format("(//ul[@class='k-list k-reset']/li[.='"+"%1$s"+"'])[1]", TestData);
				return String.format("(//ul[@class='k-list k-reset']/li[.='"+"%1$s"+"'])[1]", TestData);
				
			}
		}
		return "";
	}
	
	public static String RoleProfile_Functions(String Keyword){
		String RoleProfileActivate="";
		String RoleProfileDeactivate="";
		String RoleProfile_EditUser_CloseButton="";
		String RoleProfile_EditUser_DeleteUser="";
		String RoleProfile_EditUser_AddUserstoRP="";
		String RoleProfile_EditWindow_SelectAll_Link="";
		String RoleProfile_EditWindow_Submit="";
		String RoleProfile_EditWindow_Cancel="";
		String RoleProfile_EditUser="";
		String RoleProfile_Edit="";
		String RoleProfile_Addnew="";
		String RoleProfile_ExportToExcel="";
		
		if(Keyword.toLowerCase().trim().equals("roleprofileactivate")){
			//System.out.println("roleprofileactivate is Called");
			log.debug("roleprofileactivate is Called");
			RoleProfileActivate=String.format("(//span[@name='Activate User'])[1]");
			return String.format("(//span[@name='Activate User'])[1]");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofiledeactivate")){
			//System.out.println("roleprofiledeactivate is Called");
			log.debug("roleprofiledeactivate is Called");
			RoleProfileDeactivate=String.format("(//span[@name='Deactivate User'])[1]");
			return String.format("(//span[@name='Deactivate User'])[1]");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser_closebutton")){
			//System.out.println("roleprofile_edituser_closebutton is Called");
			log.debug("roleprofile_edituser_closebutton is Called");
			RoleProfile_EditUser_CloseButton=String.format("//button[@name='Close']");
			return String.format("//button[@name='Close']");
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser_deleteuser")){
			//System.out.println("roleprofile_edituser_deleteuser is Called");
			log.debug("roleprofile_edituser_deleteuser is Called");
			RoleProfile_EditUser_DeleteUser=String.format("//a[@name='Delete User']");
			return String.format("//a[@name='Delete User']");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser_adduserstorp")){
			//System.out.println("roleprofile_edituser_adduserstorp is Called");
			log.debug("roleprofile_edituser_adduserstorp is Called");
			RoleProfile_EditUser_AddUserstoRP=String.format("//button[@name='Add Users to Role Profile']");
			return String.format("//button[@name='Add Users to Role Profile']");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_editwindow_selectall_link")){
			//System.out.println("roleprofile_editwindow_selectall_link is Called");
			log.debug("roleprofile_editwindow_selectall_link is Called");
			RoleProfile_EditWindow_SelectAll_Link=String.format("//a[.='Select All']");
			return String.format("//a[.='Select All']");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_editwindow_submit")){
			//System.out.println("roleprofile_editwindow_submit is Called");
			log.debug("roleprofile_editwindow_submit is Called");
			RoleProfile_EditWindow_Submit=String.format("//input[@name='submit']");
			return String.format("//input[@name='submit']");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_editwindow_cancel")){
			//System.out.println("roleprofile_editwindow_cancel is Called");
			log.debug("roleprofile_editwindow_cancel is Called");
			RoleProfile_EditWindow_Cancel=String.format("//button[@name='cancel']");
			return String.format("//button[@name='cancel']");
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_edituser")){
			//System.out.println("roleprofile_edituser is Called");
			log.debug("roleprofile_edituser is Called");
			RoleProfile_Edit=String.format("(//span[@name='Edit User'])[1]");
			return String.format("(//span[@name='Edit User'])[1]");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_edit")){
			//System.out.println("roleprofile_edit is Called");
			log.debug("roleprofile_edit is Called");
			RoleProfile_Edit=String.format("(//span[@name='Edit Roles'])[1]");
			return String.format("(//span[@name='Edit Roles'])[1]");
			
		}
		else if(Keyword.toLowerCase().trim().equals("roleprofile_addnew")){
			//System.out.println("roleprofile_addnew is Called");
			log.debug("roleprofile_addnew is Called");
			RoleProfile_Addnew=String.format("//button[@class='btn btn-primary']");
			return String.format("//button[@class='btn btn-primary']");
			
		}
		/*else if(Keyword.toLowerCase().trim().equals("roleprofile_exporttoexcel")){
			log.debug("roleprofile_exporttoexcel is Called");
			RoleProfile_ExportToExcel=String.format("//*[.='Export To Excel']");
			return String.format("//*[.='Export To Excel']");
		}*/
		return "";
	}//*[.='Export To Excel']
	
	public static String ManageData_Functions(String Keyword){
		String Edit_ManageData="";
		String EditAttributes_ManageData="";
		String EditManageData_Cancel="";
		String EditManageData_Update="";
		
		if(Keyword.toLowerCase().trim().equals("edit_managedata")){
			
			//System.out.println("edit_managedata is Called");
			log.debug("edit_managedata is Called");
			Edit_ManageData=String.format("(//span[@name='Edit'])[1]");
			return String.format("(//span[@name='Edit'])[1]");
		}
		else if(Keyword.toLowerCase().trim().equals("editattributes_managedata")){
			
			//System.out.println("EditAttributes_ManageData is Called");
			log.debug("EditAttributes_ManageData is Called");
			EditAttributes_ManageData=String.format("(//span[@name='Edit Attributes'])[1]");
			return String.format("(//span[@name='Edit Attributes'])[1]");
		}
		else if(Keyword.toLowerCase().trim().equals("editmanagedata_cancel")){
			
			//System.out.println("EditManageData_Cancel is Called");
			log.debug("EditManageData_Cancel is Called");
			EditManageData_Cancel=String.format("//input[@name='Cancel']");
			return String.format("//input[@name='Cancel']");
		}
		else if(Keyword.toLowerCase().trim().equals("editmanagedata_update")){
			
			//System.out.println("EditManageData_Update is Called");
			log.debug("EditManageData_Update is Called");
			EditManageData_Update=String.format("//input[@name='Update']");
			return String.format("//input[@name='Update']");
		}
		return "";
	}
	
	public static String ClickEditUser(String Keyword, String LocatorValue, String TestData, int index){
		String GridSearch="";
		String GridSearchButton="";
		String ClickEditUser="";
		if(Keyword.toLowerCase().trim().equals("clickedituser")){
			if(index==0){
				//System.out.println("Static Grid SearchBox is Called");
				log.debug("Static Grid SearchBox is Called");
				GridSearch=String.format("//input[@name='grid_search_input']");
				return String.format("//input[@name='grid_search_input']");
			}else if(index==1){
				//System.out.println("GridSearchButton is Called");
				log.debug("GridSearchButton is Called");
				GridSearchButton=String.format("//button[@name='grid_search_button']");
				return String.format("//button[@name='grid_search_button']");
			}else if(index==2){
				//System.out.println("ClickEditUser is Called");
				log.debug("ClickEditUser is Called");
				//(//*[.='abhishek.vadla'])[2]
				ClickEditUser=String.format("(//*[.='"+"%1$s"+"'])[2]", LocatorValue);
				return String.format("(//*[.='"+"%1$s"+"'])[2]", LocatorValue);
				}
		}
		return "";
	}
	
	public static String ClearTextKeywords(String Keyword){
		String ClearInputText_TrackerRepositoryGrid="";
		String ClearInputText_MyTaskGrid="";
		String ClearInputText_GroupTaskGrid="";
		String ClearInputText_AdminModulePageGrids="";
		String ClearInputText_ConfigurationModulePagesGrids="";
		
		if(Keyword.toLowerCase().trim().equals("clearinputtext_trackerrepositorygrid")){
			
			//System.out.println("ClearInputText_TrackerRepositoryGrid is Called");
			log.debug("ClearInputText_TrackerRepositoryGrid is Called");
			
			ClearInputText_TrackerRepositoryGrid=String.format("//input[@name='grid_search_input']");
			return String.format("//input[@name='grid_search_input']");
			
		}else if(Keyword.toLowerCase().trim().equals("clearinputtext_mytaskgrid")){
			
			//System.out.println("ClearInputText_MyTaskGrid is Called");
			log.debug("ClearInputText_MyTaskGrid is Called");
			
			ClearInputText_MyTaskGrid=String.format("(//input[@name='grid_search_input'])[1]");
			return String.format("(//input[@name='grid_search_input'])[1]");
			
		}else if(Keyword.toLowerCase().trim().equals("clearinputtext_grouptaskgrid")){
			
			//System.out.println("ClearInputText_GroupTaskGrid is Called");
			log.debug("ClearInputText_GroupTaskGrid is Called");
			
			ClearInputText_GroupTaskGrid=String.format("(//input[@name='grid_search_input'])[2]");
			return String.format("(//input[@name='grid_search_input'])[2]");
			
		}else if(Keyword.toLowerCase().trim().equals("clearinputtext_adminmodulepagegrids")){
			
			//System.out.println("ClearInputText_AdminModulePageGrids is Called");
			log.debug("ClearInputText_AdminModulePageGrids is Called");
			
			ClearInputText_AdminModulePageGrids=String.format("//input[@name='grid_search_input']");
			return String.format("//input[@name='grid_search_input']");
			
		}else if(Keyword.toLowerCase().trim().equals("clearinputtext_configurationmodulepagesgrids")){
			
			//System.out.println("ClearInputText_ConfigurationModulePagesGrids is Called");
			log.debug("ClearInputText_ConfigurationModulePagesGrids is Called");
			
			ClearInputText_ConfigurationModulePagesGrids=String.format("//input[@placeholder='Search']");
			return String.format("//input[@placeholder='Search']");
		}
		
		return "";
		
	}
	
	
	
	


	
	

		
	
				
		
		
	
}


	


		
		
		

	
				
		
			
	
		

	




		//return str1;





