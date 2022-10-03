package com.banco.BancoPichinca.Entidades;

import com.banco.BancoPichinca.Entidades.Cliente;
import com.banco.BancoPichinca.Entidades.Movimientos;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-01T16:32:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ { 

    public static volatile SingularAttribute<Cuenta, String> estado;
    public static volatile SingularAttribute<Cuenta, Cliente> idCliente;
    public static volatile SetAttribute<Cuenta, Movimientos> movimientosSet;
    public static volatile SingularAttribute<Cuenta, String> tipoCuenta;
    public static volatile SingularAttribute<Cuenta, String> numeroCuenta;
    public static volatile SingularAttribute<Cuenta, Long> idCuenta;
    public static volatile SingularAttribute<Cuenta, BigDecimal> saldoInicial;

}