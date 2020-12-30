package com.danieldelfim.cursomc.entities.enums;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private Integer code;
    private String description;

    private ClientType(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    private ClientType() {
    }

    public int getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

    public static ClientType toEnum(Integer code){
        if (code == null) {
            return null;
        }
        for (ClientType x : ClientType.values()){
            if (code.equals(x.getCode())){
                return x;
            }
        }
        throw new IllegalArgumentException("id inválido: " + code);
    }

}
