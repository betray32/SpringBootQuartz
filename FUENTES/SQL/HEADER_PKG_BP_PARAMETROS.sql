create or replace PACKAGE PKG_PARAM_SPRINGBATCH
AS
-- Package header

  -- Autor  : CCONTRERASC
  -- Fecha : 20190731
  -- Objetivo :Obtener los valores asociados a la tabla parametrica de para SpringBatch
PROCEDURE USP_PARAM_OBTENER_TODO
                                (
                                  P_CODIGOERROR OUT INTEGER,
                                  P_DESCERROR OUT VARCHAR2,
                                  ESTADO OUT VARCHAR2,
                                  MINUTOSINTERVALO OUT INTEGER
                                );
                                


END PKG_PARAM_SPRINGBATCH;
