package com.banco.BancoPichinca.Entidades;

import com.banco.BancoPichinca.Entidades.Cuenta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-01T16:32:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Persona_ {

    public static volatile SetAttribute<Cliente, Cuenta> cuentaSet;
    public static volatile SingularAttribute<Cliente, String> estado;
    public static volatile SingularAttribute<Cliente, String> contrasenia;

}