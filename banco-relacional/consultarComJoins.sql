SELECT * FROM cidades INNER JOIN prefeitos ON cidades.id = prefeitos.cidade_id

SELECT * FROM cidades LEFT JOIN prefeitos ON cidades.id = prefeitos.cidade_id

SELECT * FROM cidades RIGHT JOIN prefeitos ON cidades.id = prefeitos.cidade_id

SELECT * FROM cidades LEFT JOIN prefeitos ON cidades.id = prefeitos.cidade_id
UNION
SELECT * FROM cidades RIGHT JOIN prefeitos ON cidades.id = prefeitos.cidade_id