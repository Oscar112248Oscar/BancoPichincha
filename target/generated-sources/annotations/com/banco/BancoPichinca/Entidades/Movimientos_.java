package com.banco.BancoPichinca.Entidades;

import com.banco.BancoPichinca.Entidades.Cuenta;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-01T16:32:32", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Movimientos.class)
public class Movimientos_ { 

    public static volatile SingularAttribute<Movimientos, Long> idMovimiento;
    public static volatile SingularAttribute<Movimientos, BigDecimal> valor;
    public static volatile SingularAttribute<Movimientos, String> tipoMovimiento;
    public static volatile SingularAttribute<Movimientos, BigDecimal> saldo;
    public static volatile SingularAttribute<Movimientos, Date> fechaMovimiento;
    public static volatile SingularAttribute<Movimientos, Cuenta> idCuenta;

}