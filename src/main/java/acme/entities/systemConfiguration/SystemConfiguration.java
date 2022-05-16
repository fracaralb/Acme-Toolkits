package acme.entities.systemConfiguration;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SystemConfiguration extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Pattern(regexp = "^[A-Z]{3}(?:, [A-Z]{3})*$")
	protected String 			acceptedCurrencies;
	
	@NotBlank
	@Pattern(regexp = "^[A-Z]{3}$")
	protected String 			systemCurrency;
	
	@NotBlank
	protected String 			strongSpamWords;
	
	@Digits(integer = 2, fraction = 2)
	@Range(min=0, max=100)
	protected Double 			strongSpamThreshold;
	
	@NotBlank
	protected String 			weakSpamWords;
	
	@Digits(integer = 2, fraction = 2)
	@Range(min=0, max=100)
	protected Double 			weakSpamThreshold;
	
		

	// Derived attributes -----------------------------------------------------

	// Relationships -------
}
