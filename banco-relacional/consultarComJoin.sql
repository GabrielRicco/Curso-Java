SELECT estados.nome as Estado, cidades.nome, estados.regiao FROM estados, cidades WHERE estados.id = cidades.estado_id

SELECT cidades.nome, estados.nome as Estado, estados.regiao FROM estados INNER JOIN cidades ON estados.id = cidades.estado_id