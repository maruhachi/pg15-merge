# Postgres15で追加されたMerge文を試してみる

## やったこと
* SpringDataJPA でDB呼び出しを実装
  * TraditionalRepository … 従来の、Selectして一旦レコードの存在確認をしてからInsert/Updateを切り替える
  * NewfeatureRepository … Merge文を使ってInsert/Updateを切り替える
* v15のpostgresの構築
  * dockerhubにあったPostgresの15rcのイメージを使ってコンテナを立てる

### 参考ページ

 * [PostgreSQL 15にMERGE文UPSERTがやってくる | DevelopersIO](https://dev.classmethod.jp/articles/postgresql15-suppoerts-merge-syntax-upsert/)
 * [SQL:2003](https://en.wikipedia.org/wiki/SQL:2003#:~:text=the%20new%20MERGE%20statement)
 * [java - Execute merge query in Spring JPA - Stack Overflow](https://stackoverflow.com/questions/72655093/execute-merge-query-in-spring-jpa/72701417#72701417)
 * [Spring Bootで簡単なコマンドラインアプリケーションを作成してみる - Reasonable Code](https://reasonable-code.com/command-line-runner/)
