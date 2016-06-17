package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itsphere.springmvchelloworld.Message;
import ru.itsphere.springmvchelloworld.MessageForm;
import ru.itsphere.springmvchelloworld.MessageFormValidator;
import service.UserServiceImpl;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class UserController {


    //public static final String ALL_USERS = "allUsers";
    public static final String ALL_USERS = "addUser";
    public static final String ADD_USER = "addUser";
    public static final String MESSAGES_FROM_ATTRIBUTE = "UserForm";
    public static final String MESSAGES_ATTRIBUTE = "messages";


    ArrayList<Message> list = new ArrayList<Message>();
    @Autowired
    private MessageFormValidator messageFormValidator;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(messageFormValidator);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showAllUsersPage(ModelMap model) {
        //model.addAttribute(MESSAGES_FROM_ATTRIBUTE, new MessageForm());
        model.addAttribute(MESSAGES_ATTRIBUTE, new UserServiceImpl().getAll());
        return ALL_USERS;
    }

    @RequestMapping(value = "/add/user", method = RequestMethod.GET)
    public String showPageAddUser(ModelMap model) {
        model.addAttribute("inspection", "add");
        return ADD_USER;
    }

    @RequestMapping(value = "/save/message", method = RequestMethod.POST)
    public String saveMessage(@Validated MessageForm messageForm, ModelMap model) {
        /*if (binding.hasErrors()) {
            return ALL_USERS;
        }*/
        saveMessage(messageForm);
        return showAllUsersPage(model);
    }


    private synchronized void saveMessage(MessageForm messageForm) {
        list.add(new Message(messageForm.getAuthor(), messageForm.getText()));
    }

    //private synchronized void saveMessage(UserForm messageUser) {
    //    list.add(new Message(messageUser.getAuthor(), messageUser.getText()));
    //}

}