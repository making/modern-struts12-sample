package app;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.apache.struts.action.ActionForm;

@Data
@EqualsAndHashCode(callSuper = false)
public class AccountCreateForm extends ActionForm {
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String email;
}
