ALTER TABLE empresas MODIFY cnpj VARCHAR(14)

INSERT INTO empresas (nome, cnpj)
VALUES
  ('Bradesco', 4554522124),
  ('Vale', 988797856),
  ('Cielo', 261231545);

SELECT * FROM empresas
SELECT * FROM cidades

INSERT INTO empresas_unidades (empresa_id, cidade_id, sede)
VALUES
  (1, 1, 1),
  (1, 2, 0),
  (2, 1, 0),
  (2, 2, 1)