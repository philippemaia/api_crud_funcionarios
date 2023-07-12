alter table funcionarios add column ativo tinyint not null;
update funcionarios set ativo = 1;