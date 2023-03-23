program Soma;

var
  num1, num2, resultado: integer;
  i: integer;

function SomaNumeros(x, y: integer): integer;
begin
  SomaNumeros := x + y;
end;

begin
  i := 1;
  while i <= 10 do
  begin
    if i = 5 then
    begin
      writeln('Digite o primeiro número: ');
      readln(num1);
      writeln('Digite o segundo número: ');
      readln(num2);

      resultado := SomaNumeros(num1, num2);
      writeln('A soma dos números é: ', resultado);

      writeln;
    end
    else
    begin
      writeln('Caso Contrário');
    end;

    i := i + 1;
  end;

  readln; // Espera uma entrada do usuário para encerrar o programa
end.
