SELECT empresas.nome as Empresa, cidades.nome FROM empresas, empresas_unidades, cidades 
WHERE empresas.id = empresas_unidades.empresa_id AND cidades.id = empresas_unidades.cidade_id AND sede