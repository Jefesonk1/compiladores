program Bubble;
const
  ARRAY_SIZE = 10;
var
   v: array [1..ARRAY_SIZE] of integer = (ARRAY_SIZE*2, 2, 8, 4, 1, 9, 3, 7, 6, ARRAY_SIZE);
   I, J, troca: integer;
      num1, num2, resultado: integer;

function SomaNumeros(x, y: integer): integer;
begin
  SomaNumeros := x + y;
end;

procedure bubble_sort();
begin
     I := 1;
     while I <= 10 do
     begin
          J := I + 1;
          while J <= 10 do
          begin
               if v[J] < v[I] then
               begin
                    troca := v[I];
                    v[I] := v[J];
                    v[J] := troca;
               end;
               J := J + 1;
          end;
          I := I + 1;
     end;
end;

begin
     bubble_sort();
     writeln('* Resultado *');
     I := 1;
     while I <= 10 do
     begin
          writeln('Valor ', I, ': ', v[I]);
          Inc(I);
     end;
    while i <= 12 do
  begin
    if i = 11 then
    begin
      writeln('Digite o primeiro numero: ');
      readln(num1);
      writeln('Digite o segundo numero: ');
      readln(num2);

      resultado := SomaNumeros(num1, num2);
      writeln('A soma dos numeros eh: ', resultado);

      writeln;
    end
    else
    begin
      writeln('Caso Contrario');
    end;

    i := i + 1;
  end;
end.
