package com.example.demo9;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@FacesValidator("customLengthValidator")
public class customLengthValidator implements Validator<String> {

    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        if (value == null || value.length() < 5) {
            throw new ValidatorException(new FacesMessage("Too short, minimum 5 characters."));
        }
        if (value.length() > 100) {
            throw new ValidatorException(new FacesMessage("Too long, maximum 100 characters."));
        }
    }
}
