/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.al.contractmanager.models.validators;

import java.util.Calendar;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 *
 * @author Andre Luiz Fernandes Ribeiro Barca <andrexterz@gmail.com>
 */

public class YearValidator implements ConstraintValidator<ValidYear, Integer> {

    @Override
    public void initialize(ValidYear constraintAnnotation) {
        //blank method
    }

    @Override
    public boolean isValid(Integer year, ConstraintValidatorContext constraintValidatorContext) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (year >= currentYear);
    }

    
}
