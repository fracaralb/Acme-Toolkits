package acme.features.authenticated.systemConfiguration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import acme.framework.controllers.AbstractController;
import acme.framework.roles.Authenticated;

@Controller
public class SystemConfigurationController extends AbstractController<Authenticated, SystemConfiguration>{
	
	// Internal state ----------------------------------------------------
	
	@Autowired
	protected SystemConfigurationService systemConfigurationService;
	
	// Constructors -------------------------------------------------------
	
	@PostConstruct
	protected void initialise() {
		super.addCommand("show", this.systemConfigurationService);
	}
}
