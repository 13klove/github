1. git 충돌 났을때!
   pull을 하면 에러가 난다. 이러면 작업한 로직을 commit만 한다.
   후에 pull을 받으면 merge할 수 있게 idea가 도와준다. 이때 merge하고 푸시한다.

2. git 충돌 났을때! 만약 class를 수정했는데 타인이 해당 class를 삭제 했다면?
   똑같다 pull을 하면 에러가 난다. 이러면 작업한 로직을 commit만 한다.
   후에 pull을 받으면 merge할 수 있다. 다만 상대방이 삭제한 class는 안에 어떤 로직도 없게 되고 이를 받으면 class는 있고 내용만 사라진다.

3. git 충돌 났을때! 만약 class를 수정했는데 타인이 해당 class명을 수정한다면?
   이경우 git은 기존에 있던 class는 삭제하고 새로운 class를 만든다고 생각하면 된다. 즉 2번과 똑같은 경우다.

4. git 충돌 났을때! 만약 내가 추가한 class가 다른사람도 추가한 class라면?
   추가된 class를 비교하고 안에 변경된 로직만 merge 해주면 된다.

5. push를 했는데 그 사이에 다른 사람이 push를 하면 어떻게 되는가?
   인텔리제이에서 merge하게 해준다. 기본으로 smartMerge가 되고 정말 충돌된 부분이 잇으면 merge를 사용자에게 넘긴다.

1. 다른 브런치 merge하기
   일단 fetch 받고 개발하고 있는 branch를 선택하고 원하는 branch를 선택해서 merge xxx to 개발하고 있는 branch한다.

1. qa에 dev를 merge할 때 충돌
   qa를 기준으로 새로운 브런치를 딴다 ex) qa_dev_1 이런식으로
   그리고 qa_dev_1에 dev를 merge 후에 qa_dev_1을 qa에 머지
* qa를 받아서 작업하면 안된다. 이렇게 해야 qa에만 있어야 하는 데이터 이런게 안꼬인다.

1. pull request로 리뷰는 어떻게 하나?
   흠... 이거는 조금 더 확인이 필요하다.

1. 과거 버전으로 돌아가기.
   reset 으로 버전을 돌리고 push 할때 force push한다.