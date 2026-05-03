public class Usuario
{
      private String login;
      private String senha;
      private String dataAtivacao;
      private Aplicativo[]meusapps;
    
      public Usuario(String login, String senha, String dataAtivacao)
      {
          this.login=login;
          this.senha=senha;
          this.dataAtivacao=dataAtivacao;
          this.meusapps= new Aplicativo[15];
      }
      public void addAplicativos(Aplicativo app)
      {   for(int i=0; i < 15; i++)
          {
              if(this.meusapps[i]==null)
              { this.meusapps[i]=app;
                  break;
              }
            }
      }
      public float getprecoMensal()
      {
        float total = 0;
        for (int i = 0; i < 15; i++) 
        {
            if (meusapps[i] != null) 
            {
                total += meusapps[i ].getPrecoMensal();
            }
        }
            return total;
      } 
      public Aplicativo[] getMeusapps() 
      {
         return this.meusapps;
      }
      public String getLogin()
      {
            return login;
            
      }
      public String getSenha()
      {
          return senha;
      }
      public void setSenha(String senha)
      {
          this.senha=senha;
      }
      public String getDataAtivacao()
      {
          return dataAtivacao;
      }
     
}
          

      