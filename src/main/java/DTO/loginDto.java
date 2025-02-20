/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class loginDto {
    private String email;
    private String password;

    public loginDto() {
    }

    public loginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    
    
}
