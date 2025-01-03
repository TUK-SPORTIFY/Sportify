
// Ticket List
export interface Ticket {
  voucherId: number;
  address: string;
  voucherCourseName: string;
  requestNumberOfPerson: number;
  duration: string;
  price: number;
  subCategoryImageUrl: string;
  crews: DeatilTicketCrewListProps[];
}

export interface DeatilTicketCrewListProps {
  crewId: number;
  crewName: string;
  imageUrl: string;
  difficultyLevel: string;
  numberOfParticipants: number;
  crewCapacity: number;
};

export interface TicketCompItemProps {
  data: Ticket[];
  onClickItem: (e: Ticket) => void;
}

export type TicketStatus = 'trending' | 'active';

