package app;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.dozer.Mapper;

import domain.Account;
import domain.AccountService;

@Named("/account/create")
public class AccountCreateAction extends Action {
	@Inject
	AccountService accountService;
	@Inject
	Mapper beanMapper;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Account account = beanMapper.map(form, Account.class);

		accountService.create(account);

		return mapping.findForward("success");
	}
}
