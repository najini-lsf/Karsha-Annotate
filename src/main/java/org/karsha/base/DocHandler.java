/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *   KarshaAnnotate- Annotation tool for financial documents
 *  
 *   Copyright (C) 2013, Lanka Software Foundation and and University of Maryland.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as
 *   published by the Free Software Foundation, either version 3 of the
 *   License, or (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package org.karsha.base;

/**
 *
 * @author User
 */


public class DocHandler{
    String checkSel[] ;

    public String[] getCheckSel() {
        return checkSel;
    }

    public void setCheckSel(String[] checkSel) {
        this.checkSel = checkSel;
    }
    public DocHandler(){
        checkSel = null ;
    }
    
    }