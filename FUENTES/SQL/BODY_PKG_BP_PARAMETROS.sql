-- Package BODY

  -- Autor  : CCONTRERASC
  -- Fecha : 20190731
  -- Objetivo :Obtener los valores asociados a la tabla parametrica de para SpringBatch
create or replace PACKAGE BODY PKG_PARAM_SPRINGBATCH
AS

-- Procedure para obtener los datos desde la tabla
PROCEDURE USP_PARAM_OBTENER_TODO
                                (
                                  P_CODIGOERROR OUT INTEGER,
                                  P_DESCERROR OUT VARCHAR2,
                                  ESTADO OUT VARCHAR2,
                                  MINUTOSINTERVALO OUT INTEGER
                                )
 IS
	BEGIN 
	
		SELECT ESTADO, MINUTOSINTERVALO 
		INTO ESTADO, MINUTOSINTERVALO
		FROM PARAMETRIZACION_SPRING_BATCH;

		P_CODIGOERROR:=0;
		P_DESCERROR:='OK';

	END ;

	END PKG_PARAM_SPRINGBATCH;