package com.pxp.SQLitedemon.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.pxp.SQLitedemon.Service.GuestService;
import com.pxp.SQLitedemon.entity.Guest;
@RestController
public class GuestController {
		@Autowired
		private GuestService guestService;
		@RequestMapping(value = "info", method = RequestMethod.GET)
		public String info() {
		return("API is Running");
		}
		@RequestMapping(value = "createGuest", method = RequestMethod.POST)
		public String createGuest(@RequestBody Guest Guest) {
			return guestService.createGuest(Guest);
		}
		@RequestMapping(value = "readGuest", method = RequestMethod.GET)
	    public List<Guest> readGuest(){
	        return guestService.readGuest();
	    }
		@RequestMapping(value = "updateGuest", method = RequestMethod.PUT)
		    public String updateStudet(@RequestBody Guest Guest){
		    return guestService.updateGuest(Guest);
		}
		@RequestMapping(value = "deleteGuest", method = RequestMethod.DELETE)
	    public String deleteStudent(@RequestBody Guest Guest){
	        return guestService.deleteGuest(Guest);
	
}
}
